//package ex5;
//
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Data
//@Table(name = "User")
//public class UserModel {
//
//    /*    @param user, wich generates entity into my sql table
//
//     */
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "user_id")
//    private Long id;
//    @Column(length = 30)
//    private String userName;
//    @Column(length = 30)
//    private String password;
//    @Column(length = 30)
//    private String name;
//    @Column(length = 20)
//    private String email;
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", userName='" + userName + '\'' +
//                ", password='" + password + '\'' +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
//}