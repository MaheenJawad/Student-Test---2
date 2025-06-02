interface Student {
    public void displayGrade();
}

interface RemoteStudent {
    public void attendZoomMeeting();
}

interface OnCampusStudent {
    public void attendInPersonMeeting();
}

abstract class BaseStudent implements Student {
    protected String name;
    protected String email;
    protected String contact;

    public BaseStudent(String name, String email, String contact) {
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    public void displayGrade() {
        System.out.println(name + " has received a grade.");
    }
}

class InPerson extends BaseStudent implements OnCampusStudent {
    public InPerson(String name, String email, String contact) {
        super(name, email, contact);
    }

    public void attendInPersonMeeting() {
        System.out.println(name + " is attending an in-person meeting.");
    }
}

class WorldCampus extends BaseStudent implements RemoteStudent {
    public WorldCampus(String name, String email, String contact) {
        super(name, email, contact);
    }

    public void attendZoomMeeting() {
        System.out.println(name + " is attending a Zoom meeting.");
    }
}


