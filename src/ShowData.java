import java.util.ArrayList;

public class ShowData {

    public static void main(String[] args) {

        AddDataToArrayList objAddDataToArrayList = new AddDataToArrayList();
        ArrayList<Book> myBooklist = objAddDataToArrayList.bookDetails();

        for (Book showValue : myBooklist) {

            System.out.println(showValue.getNumber() + " " + showValue.getName() + " "
                    + showValue.getAuthor() + " " + showValue.getCategory());

        }
    }
}