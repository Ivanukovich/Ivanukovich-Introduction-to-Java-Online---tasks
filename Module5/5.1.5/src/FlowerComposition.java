import java.util.Scanner;

public class FlowerComposition {
    Flower[] flowers;
    Package packaging;
    public void createFlowerComposition(int number){
        flowers = new Flower[number];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input flowers you want to add\n1 - Tulip\n3 - Narcissus\n2 - Rose");
        int index;
        for (int i = 0; i < number; ++i){
            index = sc.nextInt();
            while (index != 1 && index != 2 && index != 3){
                System.out.println("index should be 1, 2 or 3");
                index = sc.nextInt();
            }
            if (index == 1){
                flowers[i] = createFlower(FlowerType.Tulip);
            }
            if (index == 2){
                flowers[i] = createFlower(FlowerType.Narcissus);
            }
            if (index == 3){
                flowers[i] = createFlower(FlowerType.Rose);
            }
        }
        index = sc.nextInt();
        if (index == 1){
            packaging = createPackaging(PackageType.Green);
        }
        if (index == 2){
            packaging = createPackaging(PackageType.Pink);
        }
        if (index == 3){
            packaging = createPackaging(PackageType.White);
        }
    }
    public Flower createFlower (FlowerType type) {
        Flower flower = null;

        switch (type) {
            case Tulip:
                flower = new Tulip();
                break;
            case Narcissus:
                flower  = new Narcissus();
                break;
            case Rose:
                flower = new Rose();
                break;
        }
        return flower;
    }
    public Package createPackaging (PackageType type) {
        Package packageing = null;
        switch (type) {
            case Green:
                packageing = new Green();
                break;
            case Pink:
                packageing  = new Pink();
                break;
            case White:
                packageing = new White();
                break;
        }
        return packageing;
    }
}