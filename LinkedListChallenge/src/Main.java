import java.util.*;


public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Holy man", 4.22);
        album.addSong("Song 3", 4.3);
        album.addSong("225200", 5.6);
        album.addSong("BIZNIS", 3.21);
        album.addSong("CapuPlin", 4.11);
        album.addSong("SolDAT", 3.12);
        albums.add(album);

        album = new Album("for those to rock", "ac/dc");
        album.addSong("Stormbringer0", 5.6);
        album.addSong("Stormbringer1", 3.6);
        album.addSong("Stormbringer2", 4.2);
        album.addSong("Stormbringer3", 3.11);
        album.addSong("Stormbringer4", 3.44);
        album.addSong("Stormbringer5", 1.1);
        album.addSong("Stormbringer6", 2.65);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("BIZNIS", playList);
        albums.get(0).addToPlayList("Song 3", playList);
        albums.get(0).addToPlayList("Ciorap", playList); // nu exista
        albums.get(1).addToPlayList(7,playList);
        albums.get(1).addToPlayList(6,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(25,playList); // nu exista

        play(playList);
    }

    public static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward =  true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward =  false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("we are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying  " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("we have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("now playing " +listIterator.next());
                        } else if(listIterator.hasPrevious()){
                            System.out.println("now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" + "1 - to play next song\n" +"2 - to play previous song\n" + "3- to replay the current song\n" + "4- list songs in the playlist\n" + "5- print available actions\n" + "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("============================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
        System.out.println("============================");
    }
}
