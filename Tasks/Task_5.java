interface INotification {
    void Notify();
}

class Notification {
    private INotification notification;

    public Notification(INotification notification) {
        this.notification = notification;
    }

    public void Notify() {
        notification.Notify();
    }
}

class MsgNotification implements INotification {
    @Override
    public void Notify() {
        System.out.println("We have printed Message Notification of Notify Method");
    }
}

class CallNotification implements INotification {
    @Override
    public void Notify() {
        System.out.println("We have printed Call Notification of Notify Method");
    }
}

class Main {
    public static void main(String[] args) {
        MsgNotification msgNotification = new MsgNotification();
        CallNotification callNotification = new CallNotification();

        Notification msgNotify = new Notification(msgNotification);
        Notification callNotify = new Notification(callNotification);

        msgNotify.Notify();

        callNotify.Notify();
    }
}