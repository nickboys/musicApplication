//import com.nk.controller.LoginAndRegisterController;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.mock.web.MockServletContext;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//
///**
// * Created by JianHuangsh on 2017/12/8.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = MockServletContext.class)
//@WebAppConfiguration
//public class helloTest {
//
//  @Before
//  public void setUp() throws exception {
//    mvc = MockMvcBuilders.standaloneSetup(new LoginAndRegisterController()).build();
//  }
//
//  private MockMvc mvc;
//
//  @Test
//  public void testUserController() throws exception {
//    // 测试UserController
//    RequestBuilder request = null;
//
//    // 1、get查一下user列表，应该为空
//    request = get("/users/");
//    mvc.perform(request)
//        .andExpect(status().isOk())
//        .andExpect(content().string(equalTo("[]")));
//  }
//
//
//}
