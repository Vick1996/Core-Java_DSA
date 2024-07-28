package AbstractFactory;

public class PhoneMain
{
    public static void main(String[] args)
    {
        Phone phone = PhoneStore.getPhone("Apple", "iphone14");
        phone.getDescription();
        System.out.println();

        Phone phone1 = PhoneStore.getPhone("Samsung", "s24");
        phone1.getDescription();
    }
}
