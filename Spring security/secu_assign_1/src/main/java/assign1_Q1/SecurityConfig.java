package assign1_Q1;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	//@Override
	//protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	//	auth.inMemoryAuthentication()
	//	.withUser("student")
	//	.password("student")
	//	.roles("student")
	//	.and()                       // adds another user 
	//	.withUser("mentor")
	//	.password("mentor")
	//	.roles("mentor");
	//}
	
	@Bean
	
	public PasswordEncoder getpasswordencoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	//@Override                        // 3. obj of type httpsecurity to access restrictions for paths
	//protected void configure(HttpSecurity http) throws Exception {
	//	
	//	http.authorizeRequests()
	//	.antMatchers("/mentor").hasRole("mentor")
	//	.antMatchers("/student").hasAnyRole("student" , "mentor")  // use hasanyrole for multiple roles --> now student and mentor has access
	//	.antMatchers("/").permitAll()
		//.antMatchers("/**").hasRole("mentor") // this "/**" specifies all paths -->now mentor has access to all paths 1.home (/) 2.student(/student)  3.mentor(/mentor)
	//	.and().formLogin();
	//}
	
	
	

}
