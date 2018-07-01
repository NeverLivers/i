package school;

public class Magazine {

    private Student[] magazine = new Student[1];
    private int size = 0;

    public Magazine() {
    }

    public Magazine(Student[] magazine) {
        this.magazine = magazine;
    }

    public Student[] getMagazine() {
        return magazine;
    }

    public void setMagazine(Student[] magazine) {
        this.magazine = magazine;
    }


    public void sizeMagazine(int size) {
        Student[] newMagazine = new Student[size];
        magazine = newMagazine;
    }

    public void add(Student student) {
        if (size >= magazine.length) {
            extendArray();
        }
        magazine[size++] = student;
        student.setId(size);
    }

    public void extendArray() {
        Student[] newCatalog = new Student[size + 1];
        System.arraycopy(magazine, 0, newCatalog, 0, magazine.length);
        magazine = newCatalog;
    }

    public void removeByIndex(int index) {
        Student[] newMagazine = new Student[magazine.length - 1];
        System.arraycopy(magazine, 0, newMagazine, 0, index);
        System.arraycopy(magazine, index + 1, newMagazine, index, newMagazine.length - index);
        magazine = newMagazine;
    }

    public void removeById(int id) {

        for (int i = 0; i < magazine.length; i++) {
            if (magazine[i].getId() == id) {
                removeByIndex(i);
                break;
            }
        }
    }

    public Magazine searchByLName(String lName) {
        Magazine newMagazine = new Magazine();

        for (int i = 0; i < magazine.length; i++) {

            if (magazine[i].getlName() == lName) {
                newMagazine.add(magazine[i]);
            }
        }
        return newMagazine;
    }

    public Student searchById(int id) {

        for (int i = 0; i < magazine.length; i++) {
            if (magazine[i].getId() == id) {
                return magazine[i];
            }
        }
        return null;
    }
    public Student[] getMagazineClone() {
        return magazine.clone();
    }
}
