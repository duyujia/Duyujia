package houserent;

/**
 * @auther dyj
 */
public class HouseService{
    private House[] houses;//保存House对象
    private int houseNum = 1;
    private int idCounter = 1;

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1,"JACK","123","朝阳区",2000,"未出租");
         }
     //添加list方法，返回houses
    public House[] list(){
        return houses;
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse){
        //判断是否还可以继续添加房屋信息
        if(houseNum == houses.length){
            System.out.println("数组已满，不能再添加");
            return false;
        }

        houses[houseNum] = newHouse;
        houseNum++;//新增加了一个房屋信息
        //设计id自增长机制
        idCounter++;
        newHouse.setId(idCounter);
        return true;
    }

    //del方法，删除房屋信息
    public boolean del(int delId){
        //找到要删除的房屋信息的下标
        int index = -1;
        for(int i = 0;i < houseNum;i++){
            if(delId ==houses[i].getId()){
                index = i;
            }
        }

        if(index == -1){
            return false;
        }

        //如果找到，删除
        for(int i = index;i < houseNum-1;i++){
            houses[i] = houses[i+1];
        }
        houses[houseNum-1] = null;//把当前已有的房屋信息的最后一个设置为空
        houseNum--;
        return true;
    }

    public House SearchHouseID(int SearchId){
        for(int i = 0;i < houseNum;i++){
            if(SearchId-1 == i){
                return houses[i];
            }
        }
        return null;
    }

}