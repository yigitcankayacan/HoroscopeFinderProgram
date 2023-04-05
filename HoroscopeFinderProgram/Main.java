import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month;
        int day;


        System.out.print("Please enter your date of birth in months: ");
        month = scanner.nextInt();


        if (month >= 1 && month <= 12) {

            System.out.print("Please enter your date of birth in days: ");
            day = scanner.nextInt();

            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Your zodiac sign: Capricorn");
                    } else {
                        System.out.println("Your zodiac sign: Aquarius");
                    }
                } else {
                    System.out.println("You entered an incorrect date as a day. Please try again.");
                }

            }

            if (month == 2) {
                if (day >= 1 && day <= 28) {
                    if (day <= 19) {
                        System.out.println("Your zodiac sign: Aquarius");
                    } else {
                        System.out.println("Your zodiac sign: Pisces");
                    }
                }else {
                    System.out.println("You entered an incorrect date as a day. Please try again.");
                }

            }

            if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day <= 20) {
                        System.out.println("Your zodiac sign: Pisces");
                    } else {
                        System.out.println("Your zodiac sign: Aries");
                    }
                }else {
                    System.out.println("You entered an incorrect date as a day. Please try again.");
                }

            }

            if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day <= 20) {
                        System.out.println("Your zodiac sign: Aries");
                    } else {
                        System.out.println("Your zodiac sign: Taurus");
                    }
                }else {
                    System.out.println("You entered an incorrect date as a day. Please try again.");
                }

            }

            if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Your zodiac sign: Taurus");
                    } else {
                        System.out.println("Your zodiac sign: Gemini");
                    }
                }else {
                    System.out.println("You entered an incorrect date as a day. Please try again.");
                }

            }

            if (month == 6) {
                if (day >= 1 && day <= 30) {
                    if (day <= 22) {
                        System.out.println("Your zodiac sign: Gemini");
                    } else {
                        System.out.println("Your zodiac sign: Cancer");
                    }
                }else {
                    System.out.println("You entered an incorrect date as a day. Please try again.");
                }

            }

            if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        System.out.println("Your zodiac sign: Cancer");
                    } else {
                        System.out.println("Your zodiac sign: Leo");
                    }
                }else {
                    System.out.println("You entered an incorrect date as a day. Please try again.");
                }

            }

            if (month == 8) {
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        System.out.println("Your zodiac sign: Leo");
                    } else {
                        System.out.println("Your zodiac sign: Virgo");
                    }
                }else {
                    System.out.println("You entered an incorrect date as a day. Please try again.");
                }

            }

            if (month == 9) {
                if (day >= 1 && day <= 30) {
                    if (day <= 22) {
                        System.out.println("Your zodiac sign: Virgo");
                    } else {
                        System.out.println("Your zodiac sign: Libra");
                    }
                }else {
                    System.out.println("You entered an incorrect date as a day. Please try again.");
                }

            }

            if (month == 10) {
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        System.out.println("Your zodiac sign: Libra");
                    } else {
                        System.out.println("Your zodiac sign: Scorpio");
                    }
                }else {
                    System.out.println("You entered an incorrect date as a day. Please try again.");
                }

            }

            if (month == 11) {
                if (day >= 1 && day <= 30) {
                    if (day <= 21) {
                        System.out.println("Your zodiac sign: Scorpio");
                    } else {
                        System.out.println("Your Sign: Sagittarius");
                    }
                }else {
                    System.out.println("You entered an incorrect date as a day. Please try again.");
                }

            }

            if (month == 12) {
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Your Sign: Sagittarius");
                    } else {
                        System.out.println("Your zodiac sign: Capricorn");
                    }
                }else {
                    System.out.println("You entered an incorrect date as a day. Please try again.");
                }

            }


        } else {
            System.out.println("You entered an incorrect date as a month. Please try again.");
        }
    }
}

