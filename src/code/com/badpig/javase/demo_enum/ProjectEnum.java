package code.com.badpig.javase.demo_enum;

public enum  ProjectEnum {
    lovestory(1),threadpool(2),printbook(3),examonlin(4);

    private final int value;

    private ProjectEnum(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public static ProjectEnum getProjectEnumLx(int value) {
        ProjectEnum[] projectEnums = ProjectEnum.values();
        for (int i=0 ; i<projectEnums.length ; i++) {
            if(projectEnums[i].value != value) {
                continue;
            }
            return projectEnums[i];
        }
        return null;
    }
}
