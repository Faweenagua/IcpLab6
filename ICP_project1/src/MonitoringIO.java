
import java.util.Scanner;

public class MonitoringIO {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Scanner scan2 = new Scanner(System.in);

        Observatory ob1 = null;

        while (true) {
            int chooseInput;
            if (Monitoring.observatories.isEmpty()){
                System.out.println(" ");
                System.out.println("***************************************************************");
                System.out.println("***** Observatory list is empty, Create a new observatory *****");
                System.out.println("***************************************************************");
                System.out.println(" ");
                chooseInput = 1;


            }else {
                System.out.println(" ");
                System.out.println("**************************************************");
                System.out.println("***** Please select a task in the menu below *****");
                System.out.println("**************************************************");
                System.out.println("1 to Enter Observatory Data.\n2 to Enter 'Galamsay' Data.\n3 to provide monitoring statistics.\n0 to Exit");
                chooseInput = scan.nextInt();
            }


            switch (chooseInput) {
                case 1:
                    System.out.println("Input name of Observatory");
                    String obName = scan2.nextLine();
                    ob1 = new Observatory();
                    ob1.setName(obName);

                    System.out.println("Enter Country");
                    String obCountry = scan2.nextLine();
                    ob1.setCountry(obCountry);

                    System.out.println("Enter Year Started");
                    int obYear = scan.nextInt();
                    ob1.setYearStarted(obYear);

                    System.out.println("Enter Area Covered by Observatory In Square Kilometers");
                    double obArea = scan.nextDouble();
                    ob1.setAreaInSquareMeters(obArea);


                    Monitoring.observatories.add(ob1);
                    System.out.println("\n<<>> Notification: new observatory added <<>>");
                    break;



                case 2:

                    System.out.println("Select Observatory");

                    for (Observatory anObservatory: Monitoring.observatories){
                        System.out.println(Monitoring.observatories.indexOf(anObservatory)+1 + " " + anObservatory.getName() + "observatory");
                    }
                    int nameOfob = scan.nextInt();

                    System.out.println("\n[[] Input 'Galamsey' Data for the " + Monitoring.observatories.get(nameOfob-1).getName() + " observatory []]");

                    System.out.println("\nHow many 'Galamsey' activities will you like to record");
                    int numOfevents = scan.nextInt();

                    for (int i =0; i<numOfevents; i++){
                        System.out.println("\nInput Data for 'Galamsey' event " + i+1);
                        System.out.println("\nEnter colour of vegetation (Green, Yellow or Brown) or 'exit' to quit");
                        String vegColor = scan2.nextLine();
                        if(vegColor.toLowerCase().equals("exit")) break;
                        Galamsey galamsey = new Galamsey();
                        galamsey.setVegetationColour(vegColor);

                        if (vegColor.toLowerCase().equals("green")) galamsey.setVegetationColourValue(1);
                        if (vegColor.toLowerCase().equals("yellow")) galamsey.setVegetationColourValue(2);
                        if (vegColor.toLowerCase().equals("brown")) galamsey.setVegetationColourValue(3);


                        System.out.println("Enter location of 'Galamsey' site in latitude");
                        double siteLat = scan.nextDouble();
                        galamsey.setVegetationLongitude(siteLat);

                        System.out.println("Enter location of 'Galamsey' site in longitude");
                        double siteLong = scan.nextDouble();
                        galamsey.setVegetationLatitude(siteLong);


                        System.out.println("Enter the year this 'Galamsey' event started");
                        int galYear = scan.nextInt();
                        galamsey.setEventYear(galYear);

                        Monitoring.observatories.get(nameOfob-1).addEvent(galamsey);
                        System.out.println("\n<<>> Notification: 'Galamsey' data added <<>>");
                    }
                    break;
                case 3:

                    while (true) {
                        System.out.println(" ");
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("++++ Kindly choose one of the following items ++++");
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("1 to provide monitoring statistics on largest average 'Galamsey'.\n2 to provide monitoring statistics on largest 'Galamsey'.\n3 to input “galamsey” with colour value greater than a given number. or \n0 to Go Back");
                        int chooseInfoType = scan.nextInt();

                        switch (chooseInfoType) {
                            case 1:
                                System.out.println("Please intput Statistics on largest average 'Galamsey'");
                                String aveGalamStats = scan2.nextLine();
                                break;
                            case 2:
                                System.out.println("Please input monitoring statistics on largest 'Galamsey'.");
                                String largeGalamStats = scan2.nextLine();
                                break;
                            case 3:
                                System.out.println("Please specify the least number of instances of 'Galamsey'");
                                int leastInstances = scan.nextInt();
                                System.out.println("Input 'Galamseys' with instances greater than the specified number");
                                String instancesGreaterThan = scan2.nextLine();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Invalid input, Please select an item in the menu");
                                break;
                        }

                        if (chooseInfoType == 0) {
                            break;
                        }

                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid input, Please select an item in the menu");
                    break;
            }

            if(chooseInput == 0){
                break;
            }

        }

















    }
}
