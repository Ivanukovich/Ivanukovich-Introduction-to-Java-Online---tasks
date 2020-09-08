public class TravelAgency {
    Travel[] travels;
    TravelAgency (Travel[] travels){
        this.travels = travels;
    }
    void sortByType(){
        Travel save;
        for (int j = 0; j < travels.length - 1; ++j){
            for (int i = 0; i < travels.length - 1; ++i){
                if (travels[i].getType() < travels[i + 1].getType()){
                    save = travels[i];
                    travels[i] = travels[i + 1];
                    travels[i + 1] = save;
                }
            }
        }
    }
    void sortByWay(){
        Travel save;
        for (int j = 0; j < travels.length - 1; ++j){
            for (int i = 0; i < travels.length - 1; ++i){
                if (travels[i].getWay() < travels[i + 1].getWay()){
                    save = travels[i];
                    travels[i] = travels[i + 1];
                    travels[i + 1] = save;
                }
            }
        }
    }
    void sortByDays(){
        Travel save;
        for (int j = 0; j < travels.length - 1; ++j){
            for (int i = 0; i < travels.length - 1; ++i){
                if (travels[i].getDays() < travels[i + 1].getDays()){
                    save = travels[i];
                    travels[i] = travels[i + 1];
                    travels[i + 1] = save;
                }
            }
        }
    }
    void outPut(){
        for (int j = 0; j < travels.length; ++j){
            travels[j].output();
        }
    }
}
