package houserent.Utils;

import houserent.House;
import houserent.HouseService;

/**
     * @auther dyj
     */
    public class HouseView {
        private boolean loop = true;
        private char choice;
        private HouseService houseService = new HouseService(20);

        public void Menu() {

            System.out.println("=============房屋出租系统==========");
            do {
                System.out.println("1. 新增房屋");
                System.out.println("2. 查找房屋");
                System.out.println("3. 删除房屋");
                System.out.println("4. 修改房屋");
                System.out.println("5. 房屋列表");
                System.out.println("6. 退出");
                System.out.println("输入操作选择序号");
                choice = Utility.readChar();
                switch (choice){
                    case '1':
                        AddHouse();
                        break;
                    case '2':
                        SearchHouse();
                        break;
                    case '3':
                        DeleteHouse();
                        break;
                    case '4':
                        Update();
                        break;
                    case '5':
                        ShowHouseList();
                        break;
                    case '6':
                        Exit();
                        break;
                }

            } while (loop);
        }

        //显示房屋列表
        public void ShowHouseList(){
            System.out.println("===========房屋列表===========");
            System.out.println("编号\t房主\t电话\t地址\t月租\t状态（未出租/已出租）");
            House[] houses = houseService.list();
            for(int i = 0;i < houses.length;i++){//房屋列表为空解决
                if(houses[i] == null) {
                    break;
                }
                System.out.println(houses[i]);
            }
            System.out.println("房屋列表显示完毕");
        }

        //编写AddHouse()接收输入，创建House对象，调用Add方法
        public void AddHouse(){
            System.out.println("============添加房屋============");
            System.out.println("姓名");
            String name = Utility.readString(5);
            System.out.println("电话");
            String phoneNum = Utility.readString(15);
            System.out.println("地址");
            String address = Utility.readString(20);
            System.out.println("租金");
            int rent = Utility.readInt();
            System.out.println("状态");
            String state = Utility.readString(3);
            //id系统分配
            House newHouse = new House(0, name, phoneNum, address, rent, state);
            if(houseService.add(newHouse)){
                System.out.println("===========添加房屋信息成功==================");
            } else {
                System.out.println("============添加房屋失败==================");
            }

        }

        //编写DeleteHouse,接收输入的id，调用Service的del方法
        public void DeleteHouse(){
            System.out.println("=============删除房屋信息=================");
            System.out.println("请输入待删除的房屋编号(-1表示退出):");
            int delId = Utility.readInt();
            if(delId == -1){
                System.out.println("用户放弃删除房屋信息");
                return;//表示结束一个方法
            }
            //必须输入Y/N
            char delete = Utility.readConfirmSelection();
            if(delete == 'Y'){
                if(houseService.del(delId)){
                    System.out.println("=========删除房屋信息成功=================");
                } else{
                    System.out.println("==============房屋编号不存在====================");
                }

            } else{

                System.out.println("用户放弃删除房屋信息");
            }

        }

        public void Exit(){
            char a = Utility.readConfirmSelection();
            if(a =='Y'){
                loop = false;
            }
        }

        public void SearchHouse(){
            System.out.println("===========查找房屋信息===============");
            System.out.println("============请输入要查找的房屋信息===================");
            int SearchId = Utility.readInt();
            House house = houseService.SearchHouseID(SearchId);
            if(house != null){
                System.out.println(house);
                  } else{
                System.out.println("============查找的id不存在=====================");

            }
        }

        public void Update(){
            System.out.println("============修改房屋信息=============");
            System.out.println("=============输入修改的房屋id======================");
            int updateId = Utility.readInt();
            if(updateId == -1){
                System.out.println("===========放弃修改房屋信息================");
                return;
            }

            House house = houseService.SearchHouseID(updateId);
            if(house==null){
                System.out.println("===============修改的房屋编号不存在================");
                return;
            }

            System.out.println("姓名("+house.getName()+"):");
            String name = Utility.readString(5,"");//这里用户直接回车表示不修改，默认空串
            if(!"".equals(name)){
                house.setName(name);
            }
            System.out.println("电话("+house.getPhoneNum()+"):");
            String phoneNum = Utility.readString(15,"");
            if(!"".equals(phoneNum)){
                house.setPhoneNum(phoneNum);
            }
            System.out.println("地址("+house.getAddress()+"):");
            String address = Utility.readString(20,"");
            if(!"".equals(address)){
                house.setAddress(address);
            }
            System.out.println("租金("+house.getRent()+"):");
            int rent = Utility.readInt(-1);
            if(rent != -1){
                house.setRent(rent);
            }
            System.out.println("状态("+house.getState()+"):");
            String state = Utility.readString(3,"");
            if(!"".equals(state)){
                house.setState(state);
            }
        } 
    }
