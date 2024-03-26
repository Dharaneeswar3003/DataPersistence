import java.util.ArrayList;
import java.util.List;

public class FriendsBook {
    private List<Friend> friendsList;

    // requires:
    // modifies: this
    // effects: creates a FriendsBook object with an empty friendsList
    public FriendsBook() {
        friendsList = new ArrayList<>();
    }

    // requires: friend should not be null
    // modifies: this
    // effects: adds the friend to the friendsList
    public void addFriend(Friend friend) {
        friendsList.add(friend);
    }

    // requires: friend should exist in the friendsList
    // modifies: this
    // effects: removes the friend from the friendsList
    public void deleteFriend(Friend friend) {
        friendsList.remove(friend);
    }

    // requires:
    // modifies:
    // effects: returns a list of all friends in the friendsList
    public List<Friend> getAllFriends() {
        return friendsList;
    }
}