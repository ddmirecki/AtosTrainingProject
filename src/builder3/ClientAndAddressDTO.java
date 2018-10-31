package builder3;

public class ClientAndAddressDTO {
    private final int id;
    private final String firstname;
    private final String lastname;
    private final String street;
    private final String code;
    private final Integer number;
    private final String city;
    char x = 21;

    public ClientAndAddressDTO(ClientBuilder builder) {
        this.id = builder.id;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.street = builder.street;
        this.code = builder.code;
        this.number = builder.number;
        this.city = builder.city;
    }

    public ClientAndAddressDTO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getId() {
        return id;

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getStreet() {
        return street;
    }

    public String getCode() {
        return code;
    }

    public Integer getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public static class ClientBuilder {
        private int id;
        private String firstname;
        private String lastname;
        private String street;
        private String code;
        private Integer number;
        private String city;

        public ClientBuilder(int id, String firstname, String lastname, String street, String code, Integer number, String city) {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
            this.street = street;
            this.number = number;
            this.city = city;
        }

        public ClientBuilder code(String code) {
            this.code = code;
            return this;
        }

        public ClientAndAddressDTO build() {
            return new ClientAndAddressDTO(this);
        }
    }
}
