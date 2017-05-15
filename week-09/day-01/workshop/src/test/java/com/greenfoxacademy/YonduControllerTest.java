package com.greenfoxacademy;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WorkshopApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class YonduControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }
  @Test
  public void WithParameterStatusIsOk() throws Exception{
    mockMvc.perform(get("/yondu?distance=100&time=10"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.distance").value(100))
            .andExpect(jsonPath("$.time").value(10))
            .andExpect(jsonPath("$.speed").value(10));
  }
  @Test
  public void withoutParameter() throws Exception{
    mockMvc.perform(get("/yondu"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide distance and time."));
  }
}

