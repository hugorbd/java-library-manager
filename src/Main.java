import models.Library;
import utils.MenuUtils;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        MenuUtils.showMenu(library);
    }
}