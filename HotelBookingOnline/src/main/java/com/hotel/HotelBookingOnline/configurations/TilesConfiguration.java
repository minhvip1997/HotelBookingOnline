package com.hotel.HotelBookingOnline.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class TilesConfiguration extends WebMvcConfigurerAdapter {
	@Bean
	public UrlBasedViewResolver urlBasedViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setViewClass(TilesView.class);
		return resolver;
	}

	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer configure = new TilesConfigurer();
		configure.setDefinitions(new String[] {
				"/WEB-INF/tiles/tiles_client.xml",
				"/WEB-INF/tiles/tiles_client_user.xml",
				"/WEB-INF/tiles/tiles_client_rooms.xml",
				"/WEB-INF/tiles/tiles_client_booking.xml"
		});
		return configure;
	}
}
