import java.util.*;

// My Implementation of Library Management System.
class Library {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, ch = 0, id = 0, e = 0, f = 0, g = 0, h, j = 0, k = 0;
        String s = "";
        String books[] = { "The Uncommon Reader” by Alan Bennett",
                "The Library at Mount Char” by Scott Hawkins",
                "Running the Books: The Adventures of an Accidental Prison Librarian” by Avi Steinberg",
                "The Bad-Ass Librarians of Timbuktu” by Joshua Hammer",
                "African American Librarians in the Far West: Pioneers and Trailblazers” by Binnie Tate Wilkin",
                "Harry Potter and the Deathly Hallows",
                "The Diary of a Young Girl by Anne Frank" };
        while (f == 0) {
            System.out.println("Welcome to National Library\n");
            System.out.println("Are you an existing member of the library? If yes press 1 else 0");
            a = sc.nextInt();
            sc.nextLine();
            if (a == 0) {
                System.out.println("To create a new membership, enter your name");
                s = sc.nextLine();
                System.out.println("Congratulations " + s + ", your membership has been created.");
                id = generateMembershipID();
                System.out.println("Your Membership ID is " + id + ". Do remember this ID");
            }
            if (a == 1) {
                System.out.println("Enter your Membership ID");
                int c = sc.nextInt();
                sc.nextLine();

                if (c != id)
                    System.out.println("Membership ID Not Found");
                else {
                    ch = 0;
                    System.out.println("Welcome " + s);
                    int borrowedBooks[] = new int[7];
                    while (ch != 4) {
                        System.out.println("\n1. Borrow Book");
                        System.out.println("2. Return Book");
                        System.out.println("3. Delete Your Membership");
                        System.out.println("4. Exit");
                        System.out.println("Please select your choice");
                        ch = sc.nextInt();
                        sc.nextLine();

                        switch (ch) {
                            case 1:
                                if (k == 1) {
                                    System.out.println(
                                            "Please first return your borrowed books then only you can borrow new books.");
                                } else {
                                    k = 1;
                                    System.out.println("Available books:");
                                    for (int i = 0; i < books.length; i++) {
                                        System.out.println((i + 1) + ". " + books[i]);
                                    }

                                    System.out.println("Enter your book choice(s) and enter 0 when done.");
                                    int i = 0;
                                    while (i < books.length) {
                                        int bookChoice = sc.nextInt();
                                        sc.nextLine();

                                        if (bookChoice == 0) {
                                            break;
                                        } else if (bookChoice >= 1 && bookChoice <= books.length) {
                                            borrowedBooks[i] = bookChoice;
                                            i++;
                                        } else {
                                            System.out
                                                    .println("Invalid book choice. Please enter a valid book number.");
                                        }
                                    }

                                    e = i;
                                    j = i;
                                    System.out.println("Congratulations on borrowing books:");
                                    while (i > 0) {
                                        System.out.println(books[borrowedBooks[i - 1] - 1]);
                                        i--;
                                    }
                                    System.out.println(
                                            "\nYou can keep these books for 7 days. If you keep them for more than 7 days, you will be charged.");
                                }
                                break;
                            case 2:
                                if (j == 0) {
                                    System.out.println("You have not borrowed any books.");
                                } else {
                                    k = 0;
                                    System.out.println("Books you have borrowed:");
                                    while (e > 0) {
                                        System.out.println(books[borrowedBooks[e - 1] - 1]);
                                        e--;
                                    }
                                    g = 0;
                                    System.out.println("Enter the number of days you kept each book:");
                                    while (j > 0) {
                                        int days = sc.nextInt();
                                        if (days > 7) {
                                            g += (days - 7) * 10;
                                        }
                                        j--;
                                    }
                                    System.out.println("All your books have been returned.");
                                    if (g > 0) {
                                        System.out.println(
                                                "As you kept one or more books for more than 7 days, your total charge is "
                                                        + g);
                                    }
                                }

                                break;

                            case 3:
                                System.out.println("Enter your Membership ID");
                                h = sc.nextInt();
                                sc.nextLine();

                                if (h != id) {
                                    System.out.println("Membership ID does not exist");
                                } else {
                                    System.out.println("Your ID " + id + " has been successfully deleted");
                                    id = 0;
                                    ch = 4;
                                }
                                break;

                            case 4:
                                System.out.println("Goodbye!");
                                ch = 4;
                                f = 1;
                                break;

                            default:
                                System.out.println("Please enter a valid choice");
                                break;
                        }
                    }
                }
            }
        }
    }

    private static int generateMembershipID() {

        return (int) (Math.random() * 10000);
    }
}
