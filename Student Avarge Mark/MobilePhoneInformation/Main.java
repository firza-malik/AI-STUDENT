package MobilePhoneInformation;

public class Main {
    public static void main(String[] args) {
        MobilePhone[] phones = {
            new MobilePhone("A", "xX", 699, 16),
            new MobilePhone("B", "yY", 799, 32),
            new MobilePhone("C", "ZZ", 599, 8),
            new MobilePhone("D", "WW", 899, 12)
        };

        for (MobilePhone phone : phones) {
            phone.display();
        }

        phones[0].Camparephones(phones[1]);
        phones[0].MinimumStorage(phones[1]);

        for (MobilePhone phone : phones) {
            phone.display();
        }

        
        
    }
}
