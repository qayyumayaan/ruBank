package rubank;

public enum Campus {

    NEW_BRUNSWICK(0),
    NEWARK(1),
    CAMDEN(2);

    private final int code;

    /**
     * Initializes Campus.
     * @param code
     * @author Ayaan Qayyum
     */

    Campus(int code) {
        this.code = code;
    }

    /**
     * Returns the Campus code
     * @author Ayaan Qayyum
     * @return the integer code
     */
    public int getCode() {
        return code;
    }

    /**
     * Returns the campus type given a code.
     * @param code
     * @author Ayaan Qayyum
     * @return
     */
    public static Campus fromCode(int code) {
        for (Campus campus : Campus.values()) {
            if (campus.getCode() == code) {
                return campus;
            }
        }
        return null;
    }

    /**
     * Method turns campus code to string
     * @return string of campus
     * @author Ayaan Qayyum
     */
    public String toString() {
        if (code == NEW_BRUNSWICK.getCode()) return "NEW_BRUNSWICK";
        if (code == NEWARK.getCode()) return "NEWARK";
        if (code == CAMDEN.getCode()) return "CAMDEN";
        return null;
    }

}
