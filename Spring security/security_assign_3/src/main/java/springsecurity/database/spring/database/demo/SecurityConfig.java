package springsecurity.database.spring.database.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
     DataSource dataSource;	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication()
		.dataSource(dataSource);
		
		//manual entry
		//.withDefaultSchema()
		//.withUser(User.withUsername("student") .password("student") .roles("student"))
		//.withUser(User.withUsername("mentor") .password("mentor") .roles("mentor"));
		
		//.usersByUsernameQuery("select username , password ,  enabled " + "from users" + "where username is = ?" )
		//.authoritiesByUsernameQuery("select username , password ,  enabled " + "from authorities " + "where username is = ?" );
		
		
	}
	
@Bean
	
	public PasswordEncoder getpasswordencoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/mentor").hasRole("mentor")
		.antMatchers("/student").hasAnyRole("student" , "mentor") 
		.antMatchers("/").permitAll()
		.and().formLogin();
	}
	
	
	

}
