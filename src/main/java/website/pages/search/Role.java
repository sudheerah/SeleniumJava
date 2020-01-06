package website.pages.search;

public enum Role {

    BUSINESS_PROFESSIONAL("Buiseness Professional"),
    SOFTWARE_PROFESSIONAL("Software Professional");

    private String value;

    Role(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }
}
