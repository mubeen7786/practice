package AssignmentOfIntefaces;

public class Child {
    static class childClass implements CommonFeaturesClass.CommonFeatures {

        @Override
        public void ABC() {
            System.out.println("This is ABC function");
        }

        @Override
        public void CDE() {
            System.out.println("This is CDE function");

        }

        @Override
        public void MNO() {
            System.out.println("This is ABC function");

        }

        @Override
        public void XYZ() {
            System.out.println("This is ABC function");

        }
    }
}
