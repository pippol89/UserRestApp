package repository;

import model.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class UserRepoImpl implements UserRepo {
    private static final AtomicInteger currentId = new AtomicInteger();
    private static final Map<String, User> users = new ConcurrentHashMap<>();

    public UserRepoImpl() {
        /*addUser("Юля");
        addUser("Вика");
        addUser("Оля");
        addUser("Марина");*/
    }

    @Override
    public Map<String, User> getUsers() {
        return users;
    }

    @Override
    public User getUserById(int id) {
        if (users.containsKey(String.valueOf(id))) {
            return users.get(String.valueOf(id));
        } else {
            return null;
        }
    }

    @Override
    public int addUser(String name) {
        final int id = currentId.incrementAndGet();
        users.put(String.valueOf(id), new User(id, name));
        return id;
    }

    @Override
    public int updateUser(int id, String name) {
        if (users.containsKey(String.valueOf(id))) {
            users.put(String.valueOf(id), new User(id, name));
            return id;
        } else {
            return 0;
        }
    }

    @Override
    public int removeUser(int id) {
        if (users.containsKey(String.valueOf(id))) {
            users.remove(String.valueOf(id));
            return id;
        } else {
            return 0;
        }
    }
}
