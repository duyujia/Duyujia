package HouseRent;

/**
 * @auther dyj
 */
public class HouseFunction {
    private House[] houses;
    private int houseNum = 0;
    private int CountId = 1;

    public HouseFunction(int size) {
        houses = new House[size];
    }

    public House[] list(){
        return houses;
    }

    public boolean addHouse(House newHouse){
        if(houseNum >= houses.length){
            House[] housesNew = new House[houses.length+1];
            for(int i = 0;i < houses.length;i++){
                housesNew[i] = houses[i];
            }
            housesNew[houses.length] = newHouse;
            newHouse.setId(CountId);
            houseNum++;
            CountId++;
            houses = housesNew;
            System.out.println("房屋满，扩容数组后再添加");
            return true;
        } else {
            houses[houseNum] = newHouse;
            newHouse.setId(CountId);
            houseNum++;
            CountId++;
            return true;
        }

    }

    public boolean delete(int choice1){
        int num1 = -1;
        for(int i = 0;i < houseNum;i++){
            if(choice1 == houses[i].getId()){
                num1 = i;
            }
        }
        if(num1 == -1){
            return false;
        }

        for(int i = num1;i < houseNum-1;i++){
            houses[i] = houses[i+1];
        }
        houses[houseNum-1] =null;
        houseNum--;
        return true;
    }

    public House search(String name){
        for(int i = 0;i < houseNum;i++){
            if(name.equals(houses[i].getName())){
                return houses[i];
            }
        }
        return null;
    }

    public House searchId(int choice3){
        for(int i = 0;i < houseNum;i++){
            if(choice3 == i+1){
                return houses[i];
            }
        }
        return null;
    }


}
