package com.faw.config;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.data.mongodb")
@Component
public class MultipleMongoProperties {
	

    private MongoProperties primary = new MongoProperties();
    private MongoProperties secondary = new MongoProperties();
    private MongoProperties tertiary = new MongoProperties();
	/**
	 * @return the primary
	 */
	public MongoProperties getPrimary() {
		return primary;
	}
	/**
	 * @param primary the primary to set
	 */
	public void setPrimary(MongoProperties primary) {
		this.primary = primary;
	}
	/**
	 * @return the secondary
	 */
	public MongoProperties getSecondary() {
		return secondary;
	}
	/**
	 * @param secondary the secondary to set
	 */
	public void setSecondary(MongoProperties secondary) {
		this.secondary = secondary;
	}
	/**
	 * @return the tertiary
	 */
	public MongoProperties getTertiary() {
		return tertiary;
	}
	/**
	 * @param tertiary the tertiary to set
	 */
	public void setTertiary(MongoProperties tertiary) {
		this.tertiary = tertiary;
	}
}
