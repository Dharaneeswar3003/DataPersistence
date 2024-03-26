import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

public class FriendController {
    private List<Friend> friendsList;

    @FXML
    private TextArea displayArea;
    @FXML
    private TextField nameField;
    @FXML
    private TextField ageField;
    @FXML
    private TextField emailField;

    public FriendController() {
        friendsList = new ArrayList<>();
    }

    @FXML
    private void addFriend() {
        try {
            String name = nameField.getText().trim();
            int age = Integer.parseInt(ageField.getText().trim());
            String email = emailField.getText().trim();

            Friend newFriend = new Friend(name, age, email);
            friendsList.add(newFriend);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Friend added successfully!");
            alert.showAndWait();

            clearInputFields();
        } catch (NumberFormatException e) {
            showErrorAlert("Invalid age input. Please enter a valid number.");
        }
    }

    @FXML
    private void displayFriends() {
        displayArea.clear();
        for (Friend friend : friendsList) {
            displayArea.appendText(friend.toString() + "\n");
        }
    }

    @FXML
    private void deleteFriend() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Delete Friend");
        dialog.setHeaderText(null);
        dialog.setContentText("Enter friend's name to delete:");

        String nameToDelete = dialog.showAndWait().orElse("").trim();

        Friend friendToDelete = findFriendByName(nameToDelete);

        if (friendToDelete != null) {
            friendsList.remove(friendToDelete);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Friend deleted successfully!");
            alert.showAndWait();
        } else {
            showErrorAlert("Friend not found.");
        }
    }

    private Friend findFriendByName(String name) {
        for (Friend friend : friendsList) {
            if (friend.getname().equalsIgnoreCase(name)) {
                return friend;
            }
        }
        return null;
    }

    private void showErrorAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearInputFields() {
        nameField.clear();
        ageField.clear();
        emailField.clear();
    }
}