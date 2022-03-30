import java.sql.*;
import java.util.ArrayList;

public class Hello
{
    public static void insert(Customer customer) throws SQLException
    {
        String connectionUrl = "jdbc:mysql://localhost:3306/newdb";
        String username = "root";
        String password = "admin";
        Connection connection = DriverManager.getConnection(connectionUrl, username, password);

        PreparedStatement psw = connection.prepareStatement("INSERT INTO `customers` (`ID`, `username`, `lastName`, `firstName`, `phone`, `address`, `city`, `postalCode`, `country`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
        psw.setInt(1, customer.getID());
        psw.setString(2, customer.getUsername());
        psw.setString(3, customer.getLastName());
        psw.setString(4, customer.getFirstName());
        psw.setString(5, customer.getPhone());
        psw.setString(6, customer.getAddress());
        psw.setString(7, customer.getCity());
        psw.setString(8, customer.getPostalCode());
        psw.setString(9, customer.getCountry());
        psw.execute();
    }

    public static Customer getById(Connection connection, int ID) throws SQLException //Method getById for table customers
    {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM customers WHERE id =" + ID);
        try
        {
            rs.next();
            return new Customer.CustomerBuilder()
                    .ID(rs.getInt("ID"))
                    .username(rs.getString("username"))
                    .lastName(rs.getString("lastName"))
                    .firstName(rs.getString("firstName"))
                    .phone(rs.getString("phone"))
                    .address(rs.getString("address"))
                    .city(rs.getString("city"))
                    .postalCode(rs.getString("postalCode"))
                    .country(rs.getString("country")).build();
        }
        catch (Exception e)
        {
            System.out.println("Nu exista nici un customer cu id-ul  " + ID);
        }
        return null;
    }

    public static ArrayList<Customer> getAll(Connection connection) throws SQLException //Method getAll for table customers
    {
        String tableName = "Customers";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM " + tableName);
        ArrayList<Customer> customers = new ArrayList<>();
        while(rs.next())
        {
            System.out.println("ID: " + rs.getInt("ID"));
            System.out.println("username: " + rs.getString("username"));
            System.out.println("lastName: " + rs.getString("lastName"));
            System.out.println("firstName: " + rs.getString("firstName"));
        }
        return customers;
    }

    public static void update(Connection connection, Customer customer) throws SQLException //Method update for table customers
    {
        Statement statement = connection.createStatement();
        PreparedStatement ps = connection.prepareStatement("UPDATE customers SET username = ?, lastName = ?, firstName = ?, phone = ?, address = ?, city = ?, postalCode = ?, country= ? WHERE id = ?");
        ps.setString(1, customer.getUsername());
        ps.setString(2, customer.getLastName());
        ps.setString(3, customer.getFirstName());
        ps.setString(4, customer.getPhone());
        ps.setString(5, customer.getAddress());
        ps.setString(6, customer.getCity());
        ps.setString(7, customer.getPostalCode());
        ps.setString(8, customer.getCountry());
        ps.setInt(9, customer.getID());
        ps.execute();
    }

    public static void insert(Connection connection, Customer customer) throws SQLException //Method insert for table customers
    {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO customers (ID, username, lastName, firstName, phone, address, city, postalCode, country) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        ps.setInt(1, customer.getID());
        ps.setString(2, customer.getUsername());
        ps.setString(3, customer.getLastName());
        ps.setString(4, customer.getFirstName());
        ps.setString(5, customer.getPhone());
        ps.setString(6, customer.getAddress());
        ps.setString(7, customer.getCity());
        ps.setString(8, customer.getPostalCode());
        ps.setString(9, customer.getCountry());
        ps.execute();
    }

    public static int delete(Connection connection, int ID) //Method delete for table customers
    {
        try
        {
            Statement statement = connection.createStatement();
            int rs = statement.executeUpdate("DELETE FROM customers WHERE ID = " + ID);

            return rs;
        }
        catch (SQLException e)
        {
            System.out.println("Nu exista nici un customer cu id-ul  " + ID);
        }

        return 0;
    }

    public void addNewOrder(Connection connection, Order order) throws SQLException //Method that adds a new order to an existing customer
    {

        PreparedStatement ps = connection.prepareStatement("INSERT INTO orders (orderDate, shippingDate, status, comments, customerId,) VALUES (?, ?, ?, ?, ?)");
        ps.setDate(1, (Date) order.getOrderDate());
        ps.setDate(2, (Date) order.getShippedDate());
        ps.setString(3, order.getStatus());
        ps.setString(4, order.getComments());
        ps.setInt(5, order.getCustomerId());
        ps.execute();
    }

    public void viewAllOrders(Connection connection, int customerId) throws SQLException //Method view all orders of an existing customer
    {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM orders WHERE customerId = " + customerId);
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            System.out.println(rs.getDate("orderDate") + ";" + rs.getDate("shippedDate") + ";" + rs.getString("status") + ";" + rs.getString("comments"));
        }
    }

    public void updateOrder(Connection connection, String status, int customerId) throws SQLException //Method update status of an order
    {
        String updateStatus = ("UPDATE orders SET status = ? WHERE id = " + customerId);
        PreparedStatement ps = connection.prepareStatement(updateStatus);
        ps.setString(1, status);
        ps.execute();
    }

    public void addComments(Connection connection, String comment, int customerId) throws SQLException //Method add comments to an order
    {
        String addComment = ("UPDATE orders SET comments=? WHERE id = " + customerId);
        PreparedStatement preparedStatement = connection.prepareStatement(addComment);
        preparedStatement.setString(1, comment);
        preparedStatement.execute();
    }
}