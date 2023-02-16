package com.jpa;

import com.jpa.dao.UserRepository;
import com.jpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class BootjpaexampleApplication {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);


        /////// BASIC CRUD OPERATION ON USER TABLE ///////

        ////// CREATE METHOD...//////////////////////////////////////////////////////////////////////////


        // Create object for User...
//		User user = new User();
//		user.setName("Dev Patel");
//		user.setCity("Adalaj");
//		user.setStatus("I am java programmer");

//        User user1 = new User();
//        user1.setName("ABC");
//        user1.setCity("dfs");
//        user1.setStatus("python programmer");
//
//        User user2 = new User();
//        user2.setName("xyz");
//        user2.setCity("eff");
//        user2.setStatus("c programmer");


        // Used to saving single user...
//             User resultUser =userRepository.save(user2);
//            System.out.println("saved user" + " : " + resultUser);

        // To save multiple users...
//            List<User> users = List.of(user1, user2);
//            Iterable<User> result = userRepository.saveAll(users);
        // Iterable is parent of our collections..

        //By using forEach user will come one by one from result..
        // lambda method is used in ths forEach..
//            result.forEach(user -> {
//                System.out.println(user);
//            } );



        ///// UPDATE METHOD...//////////////////////////////////////////////////////////////////////////////


        // Update user by his ID 152...
        // First get the data by findById method.
//        Optional<User> optional  = userRepository.findById(152);
//        User user = optional.get();
//
//        // After getting details update the value of user by set method.
//        user.setName("ABC XYZ");
//        User result = userRepository.save(user);
//
//        System.out.println(result);


        // How to get the data...

        // METHOD:1
        // using findById method - to derived particular data from table.
        // findById(id) - return optional containing your data.


        // METHOD:2
        //To find all user list from table
//        Iterable<User> itr = userRepository.findAll();


        // TYPE:1 => By using Anonymous class...
        // Below is accepts function which will work for all user.
        // It called as  anonymous class.
//            itr.forEach(new Consumer<User>() {
//                @Override
//                public void accept(User user) {
//                    System.out.println(user);
//                }
//            });
        // used to derive all users data from table.


        // TYPE:2 => By using lambda function
//            itr.forEach(user -> {System.out.println(user);} );


        // OUTPUT:
        // "User{id=152, name='ABC XYZ', city='dfs', status='python programmer'}
        //User{id=1, name='Dev Patel', city='adalaj', status='I am java programmer'}
        //User{id=2, name='Dev Patel', city='Adalaj', status='I am java programmer'}
        //User{id=52, name='xyz', city='eff', status='c programmer'}
        //User{id=102, name='xyz', city='eff', status='c programmer'}
        //User{id=152, name='ABC XYZ', city='dfs', status='python programmer'}
        //User{id=153, name='xyz', city='eff', status='c programmer'}
        //Done!"


        ///// DELETE METHOD...////////////////////////////////////////////////////////////////////////////


        //Deleting the user element...
        // Delete by ID...
//        userRepository.deleteById(102);
//        System.out.println("deleted successfully");


        // Delete all users...
        //First get all user.
//        Iterable<User> allusers = userRepository.findAll();
//        allusers.forEach(user -> System.out.println(user));

        // To delete all users which are passed forEach method.
//        userRepository.deleteAll(allusers);

        // OUTPUT...
        //deleted successfully
        //Done!




        ///// CUSTOM FINDER METHOD... ///////////////////////////////////////////////////////////////////////
                    // OR
        ///// DERIVED QUERY METHOD.../////


        // Custom Finders likes,
        // data by name
        //data by name and pwd
        //data by name  or pwd
        //data name starting with prefix ,etc.

        // Those Custom methods are creates in interface called UserRepository...
        // After creating custom method lets test it..

        // Custom method is "findByName".
//        List<User> users = userRepository.findByName("xyz");
//        users.forEach(user -> System.out.println(user));
//        System.out.println("Find user by name successfully");

        //OUTPUT:
        //User{id=52, name='xyz', city='eff', status='c programmer'}
        //User{id=153, name='xyz', city='eff', status='c programmer'}
        //Find user by name successfully
        //Done!


        System.out.println("Done!"); // Print after performing operation successfully...


    }

}
