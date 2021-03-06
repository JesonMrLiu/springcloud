package com.spring.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.spring.cloud.config.FooConfiguration;
import com.spring.cloud.entity.User;

import feign.Param;
import feign.RequestLine;

@FeignClient(name = "microservice-provider-user", configuration = FooConfiguration.class)
public interface UserFeignClient {

	/**
	 * 注意：要使用Feign的注解
	 * <p>
	 * <code>@RequestLine("GET /repos/{owner}/{repo}/contributors")</code>
	 * <br>
	 * <code>List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repo);</code>
	 * 
	 * @param id
	 * @return
	 */
	@RequestLine("GET /simple/{id}")
	public User findById(@Param("id") Long id);
	
}
