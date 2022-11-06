import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int gun, ay;

        Scanner grs = new Scanner(System.in);
        System.out.println("Dogum ayinizi giriniz");
        ay = grs.nextInt();
        if(ay < 1 || ay > 12){
            System.out.println("hatali ay");
        }

        System.out.println("Dogum gunuzu giriniz");
        gun = grs.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    System.out.println("oglak burcu");
                } else {
                    System.out.println("kova burcu");
                }
            }
                else {
                System.out.println("Hatali gun");
                }
        }



        else if(ay == 2) {
            if(gun>=1&&gun<=28){
                if (gun < 20) {
                    System.out.println("kova burcu");
                } else{
                    System.out.println("balik burcu");
                }
            }
            else {
                System.out.println("Hatali gun");
            }
        }

            else if (ay == 3) {
            if(gun>=1&&gun<=31){
                if (gun < 21) {
                    System.out.println("balik burcu");
                } else {
                    System.out.println("koc burcu");
                }
            }
            else {
                System.out.println("Hatali gun");
            }
            }

            else if (ay == 4) {
            if(gun>=1&&gun<=30) {
                if (gun < 21) {
                    System.out.println("koc burcu");
                } else {
                    System.out.println("boga burcu");
                }
            }
            else {
                System.out.println("Hatali gun");
            }
            }

            else if (ay == 5) {
            if(gun>=1&&gun<=31) {
                if (gun < 22) {
                    System.out.println("boga burcu");
                } else {
                    System.out.println("ikizler burcu");
                }
            }
            else {
                System.out.println("Hatali gun");
            }
            }

            else if (ay == 6) {
            if(gun>=1&&gun<=30) {
                if (gun < 23) {
                    System.out.println("ikizler burcu");
                } else {
                    System.out.println("yengec burcu");
                }
            }
            else {
                System.out.println("Hatali gun");
            }
            }

            else if (ay == 7) {
            if(gun>=1&&gun<=31) {
                if (gun < 23) {
                    System.out.println("yengec burcu");
                } else {
                    System.out.println("aslan burcu");
                }
            }
            else {
                System.out.println("Hatali gun");
            }
            }

            else if (ay == 8) {
            if(gun>=1&&gun<=31) {
                if (gun < 23) {
                    System.out.println("aslan burcu");
                } else {
                    System.out.println("basak burcu");
                }
            }
            else {
                System.out.println("Hatali gun");
            }
            }

            else if (ay == 9) {
            if(gun>=1&&gun<=30) {
                if (gun < 23) {
                    System.out.println("basak burcu");
                } else {
                    System.out.println("terazi burcu");
                }
            }
            else {
                System.out.println("Hatali gun");
            }
            }

            else if (ay == 10) {
            if(gun>=1&&gun<=31) {
                if (gun < 23) {
                    System.out.println("terazi burcu");
                } else {
                    System.out.println("akrep burcu");
                }
            }
            else {
                System.out.println("Hatali gun");
            }
            }

            else if (ay == 11) {
            if(gun>=1&&gun<=31) {
                if (gun < 22) {
                    System.out.println("akrep burcu");
                } else {
                    System.out.println("yay burcu");
                }
            }
            else {
                System.out.println("Hatali gun");
            }
            }


            else if (ay == 12) {
                if(gun>=1&&gun<=31) {
                    if (gun < 22) {
                        System.out.println("yay burcu");
                    } else {
                        System.out.println("oglak burcu");
                    }
                }
                else {
                    System.out.println("Hatali gun");
                }
            }
    }

}

