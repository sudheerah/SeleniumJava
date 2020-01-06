package website.pages.search;

public enum Tab {

    ALL("All"),
    COURSES("Courses"),
    BLOG("Blog"),
    RESOURCES("Resources"),
    AUTHOURS("Authors");

    private String value;

    Tab(String value){
        this.value = value;
    }

    public String toString(){
        return value;
    }
}
