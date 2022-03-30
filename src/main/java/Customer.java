public class Customer
{
    private int ID;
    private String username;
    private String lastName;
    private String firstName;
    private String phone;
    private String address;
    private String city;
    private String postalCode;
    private String country;

    public Customer(CustomerBuilder customerBuilder)
    {
        try
        {
            this.ID = customerBuilder.ID;
            this.username = customerBuilder.username;
            this.lastName = customerBuilder.lastName;
            this.firstName = customerBuilder.firstName;
            this.phone = customerBuilder.phone;
            this.address = customerBuilder.address;
            this.city = customerBuilder.city;
            this.postalCode = customerBuilder.postalCode;
            this.country = customerBuilder.country;
        }
        catch (Exception e)
        {
            System.out.println("Nu se poate crea obiectul Customer!!");
        }
    }

    public int getID()
    {
        return ID;
    }

    public String getAddress()
    {
        return address;
    }

    public String getCity()
    {
        return city;
    }

    public String getCountry()
    {
        return country;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getUsername()
    {
        return username;
    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "ID=" + ID +
                ", username='" + username + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    static class CustomerBuilder
    {
        private int ID;
        private String username;
        private String lastName;
        private String firstName;
        private String phone;
        private String address;
        private String city;
        private String postalCode;
        private String country;

        public CustomerBuilder()
        {
        }

        public Customer build()
        {
            if (ID != 0 && username != null && firstName != null && lastName != null && phone != null && address != null && city != null && postalCode != null && country != null)
            {
                return new Customer(this);
            }
            else return null;
        }

        public CustomerBuilder ID(int ID)
        {
            this.ID = ID;
            return this;
        }

        public CustomerBuilder username(String username)
        {
            this.username = username;
            return this;
        }

        public CustomerBuilder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder phone(String phone)
        {
            this.phone = phone;
            return this;
        }

        public CustomerBuilder address(String address)
        {
            this.address = address;
            return this;
        }

        public CustomerBuilder city(String city)
        {
            this.city = city;
            return this;
        }

        public CustomerBuilder postalCode(String postalCode)
        {
            this.postalCode = postalCode;
            return this;
        }

        public CustomerBuilder country(String country)
        {
            this.country = country;
            return this;
        }
    }
}