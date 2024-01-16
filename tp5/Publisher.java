public interface Publisher {

    void register_obs(Observer obs);
    void remove_obs(Observer obs);
    void notify_obs();

}
