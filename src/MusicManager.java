public class MusicManager {


    public void addSong(Songs songs, String groupName, String SongName) {

        if (songs != null && !groupName.trim().isEmpty() && !SongName.trim().isEmpty()) {
            System.out.println(songs.getSongName() + " has been added");

        } else {

            System.out.println("unexpected issue is occured");

        }


    }

    public void removeSong(Songs songs) { // I just wanted it seems different so under this scope using try and catch.
                                         // nevertheless, could have been used if-else -Muratcan.G
        try {

            songs.setSongName("");
            songs.setGroupName("");
        } catch (NullPointerException e) {
            e.getStackTrace();
            System.out.println(e.getMessage());
        }

    }

    public void updateSongArtist(Songs songs, String groupName) {

        if (!groupName.trim().isEmpty() && songs != null) {

            songs.setGroupName(groupName);
            System.out.println("Group name has been updated");

        } else {
            System.out.println("unexpected issue is occured");
        }

    }

    public void updateSongName(Songs songs, String newSongName) {

        if (!newSongName.isEmpty() && songs != null) {

            songs.setSongName(newSongName);
            System.out.println("Song name has been updated");


        } else {

            System.out.println("unexpected issue is occured");

        }


    }


}
