import java.util.ArrayList;

public class Main {


    public static void main(String args[]) {

        MusicManager musicManager = new MusicManager();

        ArrayList<Songs> mySongs = new ArrayList<>();

        mySongs.add(new Songs("Manga", "Dursun zaman"));
        mySongs.add(new Songs("Mor ve ötesi", "Bir derdim var"));
        mySongs.add(new Songs("Model", "Kuğunun Ağıtı"));
        mySongs.add(new Songs("Duman", "Helal olsun"));
        mySongs.add(new Songs("", ""));


        musicManager.removeSong(mySongs.get(1));
        musicManager.updateSongArtist(mySongs.get(2), "Deneme");


        for (Songs songs : mySongs) {

            System.out.println(songs.getSongName() + " - " + songs.getGroupName() + "\n");

        }


    }


}
