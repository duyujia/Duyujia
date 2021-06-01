package HouseRent;

/**
 * @auther dyj
 */
public class HouseView {
    private char choice;
    private boolean loop = true;
    private HouseFunction houseFunction = new HouseFunction(1);
    public void menu(){
        System.out.println("======房屋出租系统======");
        do{
            System.out.println("1 新增房屋");
            System.out.println("2 查找房屋");
            System.out.println("3 删除房屋");
            System.out.println("4 修改房屋信息");
            System.out.println("5 房屋列表");
            System.out.println("6 退出");
            System.out.println("输入选择编号");
            choice = Utility.readChar();
            switch (choice){
                case '1':
                    AddHouse();
                    break;
                case '2':
                    Search();
                    break;
                case '3':
                    Delete();
                    break;
                case '4':
                    Alter();
                    break;
                case '5':
                    ShowHouseList();
                    break;
                case '6':
                    Exit();
                    break;
            }
        }while (loop);
    }

    public void ShowHouseList(){
        System.out.println("显示房屋列表");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态");
        House[] houses = houseFunction.list();
        for(int i = 0;i < houses.length;i++){
            if(houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }

    }

    public void AddHouse(){
        System.out.println("添加房屋");
        System.out.println("姓名");
        String name = Utility.readString(10);
        System.out.println("电话");
        String phoneNum = Utility.readString(18);
        System.out.println("地址");
        String address = Utility.readString(20);
        System.out.println("租金");
        int rent = Utility.readInt();
        System.out.println("状态");
        String state = Utility.readString(3);
        House newHouse = new House(0,name,phoneNum,address,rent,state);
        if(houseFunction.addHouse(newHouse)){
            System.out.println("添加房屋成功");
        } else {
            System.out.println("添加房屋不成功");
        }
    }

    public void Delete(){
        System.out.println("删除房屋");
        System.out.println("请输入要删除的房屋编号(-1表示退出)");
        int choice1 = Utility.readInt();
        if(choice1==-1){
            System.out.println("退出");
            return;
        }
        char choice2 = Utility.readConfirmSelection();
        if(choice2 == 'Y'){
            if(houseFunction.delete(choice1)){
                System.out.println("删除房屋成功");
            } else {
                System.out.println("房屋编号不存在");
            }

        } else {
            System.out.println("用户放弃删除房屋信息");
        }
    }

    public void Search(){
        System.out.println("查找房屋");
        System.out.println("请输入查找的name");
        String searchName = Utility.readString(10);
        House house = houseFunction.search(searchName);
        if(house != null){
            System.out.println(house);
        } else {
            System.out.println("查找的房主不存在");
        }
    }

    public void Alter(){
        System.out.println("修改房屋信息");
        System.out.println("请选择修改房屋信息编号(-1退出)");
        int choice3 = Utility.readInt();
        if(choice3 == -1){
            System.out.println("退出");
            return;
        }
        House house = houseFunction.searchId(choice3);
        if(house==null){
            System.out.println("房屋不存在");
            return;
        }
        System.out.println("姓名(" + house.getName()+"):");
        String name = Utility.readString(10,"");
        if(!"".equals(name)){
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhoneNum()+"):");
        String phoneNum = Utility.readString(20,"");
        if(!"".equals(phoneNum)){
            house.setPhoneNum(phoneNum);
        }

        System.out.println("地址(" + house.getAddress()+"):");
        String address = Utility.readString(20,"");
        if(!"".equals(address)){
            house.setAddress(address);
        }

        System.out.println("租金(" + house.getRent()+"):");
        int rent = Utility.readInt(-100);
        if(rent != -100){
            house.setRent(rent);
        }

        System.out.println("状态(" + house.getState()+"):");
        String state = Utility.readString(3,"");
        if(!"".equals(state)){
            house.setState(state);
        }
    }

    public void Exit(){
        char a = Utility.readConfirmSelection();
        if(a == 'Y'){
            loop =false;
        }
    }

}
