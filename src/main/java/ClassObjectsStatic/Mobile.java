package ClassObjectsStatic;

public class Mobile {
        String model;
        double price;
        String memory;
        boolean isOn;

        public Mobile(String model, double price, String memory) {
            model = model;
            price = price;
            memory = memory;
            isOn = true;
        }

        public void ring() {
            System.out.println("The " + model + " is ringing.");
        }

        public void turnOn() {
            if (isOn) {
                System.out.println("The phone " + model + "is on");
            } else {
                System.out.println("The phone " + model + "is OFF");
            }
        }

        public void turnOff() {
            if (!isOn) {
                System.out.println("The phone " + model + "is OFF");
            } else {
                System.out.println("The phone " + model + "is ON");
            }

        }

    }




