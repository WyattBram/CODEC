import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Media> allMedia = new ArrayList<Media>();
        int choice;
        do{

            System.out.println(
                    "1. Add Image\n" +
                            "2. Add Music\n" +
                            "3. Add Video\n" +
                            "4. Show images\n" +
                            "5. Show music\n" +
                            "6. Show videos\n" +
                            "7. Show images and videos\n" +
                            "8. Show music and videos\n" +
                            "9. Quit");

            Scanner x = new Scanner (System.in);
            choice = x.nextInt();
            x.nextLine();


            if (choice == 1){
                System.out.println("Enter file name:");
                String a = x.nextLine();
                System.out.println("Enter image codec:");
                String b = x.nextLine();
                Image i = new Image(a,b);
                allMedia.add(i);

            }

            else if (choice == 2){
                System.out.println("Enter file name:");
                String a = x.nextLine();
                System.out.println("Enter audio codec:");
                String b = x.nextLine();
                Music i = new Music(a,b);
                allMedia.add(i);

            }

            else if (choice == 3){
                System.out.println("Enter file name:");
                String a = x.nextLine();
                System.out.println("Enter image codec:");
                String b = x.nextLine();
                System.out.println("Enter audio codec:");
                String c = x.nextLine();

                Video i = new Video(a,b,c);
                allMedia.add(i);

            }

            else if (choice == 4){
                System.out.println("");
                for(Media y: allMedia){
                    if(y instanceof Image ){
                        System.out.println(((Image) y).getMediaInfo());
                    }
                }

            }

            else if (choice == 5){
                System.out.println("");
                for(Media y: allMedia){
                    if(y instanceof Music ){
                        System.out.println(((Music) y).getMediaInfo());
                    }
                }

            }

            else if (choice == 6){
                System.out.println("");
                for(Media y: allMedia){
                    if(y instanceof Video ){
                        System.out.println(((Video) y).getMediaInfo());
                    }
                }

            }

            else if (choice == 7){
                System.out.println("");
                for(Media y: allMedia){
                    if(y instanceof IImageStandard ){
                        if(y instanceof Image ){
                            System.out.println(((Image) y).getMediaInfo());
                        }
                        if(y instanceof Video ){
                            System.out.println(((Video) y).getMediaInfo());
                        }

                    }
                }
            }

            else if (choice == 8){
                System.out.println("");
                for(Media y: allMedia){
                    if(y instanceof IAudioStandard ){
                        if(y instanceof Music ){
                            System.out.println(((Music) y).getMediaInfo());
                        }
                        if(y instanceof Video ){
                            System.out.println(((Video) y).getMediaInfo());
                        }
                    }
                }
            }



        }while (choice != 9);

    }
}
