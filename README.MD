




 * {@link EnableAutoConfiguration} 作用:从 classpath 中搜索所有 META-INF/spring.factories 配置文件
 * 然后,将其中 {@link org.springframework.boot.autoconfigure.EnableAutoConfiguration} key 对应的配置项添加到 spring 容器中
 * <p>
 * 只有 spring.boot.enableautoconfiguration 为 true(默认为 true)的时候,才启用自动配置
 * {@link EnableAutoConfiguration} 还可以排除,
 * <p>
 * 其内部有实现的关键点:
 * 1.ImportSelector 该接口的方法返回值都会被纳入到 spring 容器管理中
 * 2.SpringFactoriesLoader 该类可以从 classpath 中搜索所有 META-INF/spring.factories 配置文件,并读取配置





    boolean isAnnotated(String var1);

    @Nullable
    Map<String, Object> getAnnotationAttributes(String var1);

    @Nullable
    Map<String, Object> getAnnotationAttributes(String var1, boolean var2);

    @Nullable
    MultiValueMap<String, Object> getAllAnnotationAttributes(String var1);

    @Nullable
    MultiValueMap<String, Object> getAllAnnotationAttributes(String var1, boolean var2);


	/**
	 * Return the {@link BeanDefinitionRegistry} that will hold the bean definition
	 * should the condition match.
	 */
	BeanDefinitionRegistry getRegistry();

	/**
	 * Return the {@link ConfigurableListableBeanFactory} that will hold the bean
	 * definition should the condition match.
	 */
	ConfigurableListableBeanFactory getBeanFactory();

	/**
	 * Return the {@link Environment} for which the current application is running.
	 */
	Environment getEnvironment();

	/**
	 * Return the {@link ResourceLoader} currently being used.
	 */
	ResourceLoader getResourceLoader();

	/**
	 * Return the {@link ClassLoader} that should be used to load additional classes.
	 */
	ClassLoader getClassLoader();








