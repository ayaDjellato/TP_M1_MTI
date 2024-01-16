public class TaxCalcul {
     public double calculateTax(String country) {
        switch (country.toLowerCase()) {
            case "dz":
                return 17;
            case "fr":
                return 20;
            case "us":
                return 19;
            default:
                throw new IllegalArgumentException("Invalid country code");
        }
    }
}

