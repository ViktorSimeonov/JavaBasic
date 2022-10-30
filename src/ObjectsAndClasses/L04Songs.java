package ObjectsAndClasses;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class L04Songs {
 static class Song {
    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    private String typeList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String time;

    public Song(String typeList, String name, String time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //count of song
        int songNum = Integer.parseInt(scanner.nextLine());
        // create List form Song
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < songNum; i++) {
            //Split of the input in Array
            String[] currentSong = scanner.nextLine().split("_");
            //String typeSong = currentSong[0];
            //String name = currentSong[1];
            //String time = currentSong[2];
            //create and fill song
            Song song = new Song(currentSong[0], currentSong[1], currentSong[2]);
            /*song.setTypeList(typeSong);
            song.setName(name);
            song.setTime(time);*/
            //adding the current song in the List
            songs.add(song);
        }
        String toPrint = scanner.nextLine();

            if (toPrint.equals("all")){
                for (Song song : songs) {
                    System.out.println(song.getName());
                }
            }else {
                for (int i = 0; i < songs.size(); i++) {
                   Song song=songs.get(i);
                   String type = song.getTypeList();
                   if(toPrint.equals(type)){
                       String name = song.getName();
                       System.out.println(name);
                   }

                }
            }

    }
}