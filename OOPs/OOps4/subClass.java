package OOPs.OOps4;
class subClass extends A1 {
    subClass(){

    }


 public static void main(String[] args) {
        A1 obj = new A1(10,"Pranav");
        // need to do a few things
        // 1. access the data members
        // 2. modify the data members
        System.out.println(obj.getNum());
        obj.setNum(8);
        System.out.println(obj.getNum());
        String n = obj.name;
        /*
                             
                          class     package        subclass(same pack)               subclass(diff pack)                    world(diff pkg and not subclass)

        public              +          +                    +                                   +                                   +

        protected           +          +                    +                                   +   

        no modifier         +          +                    +

        private             +



         */


        
    }
}

