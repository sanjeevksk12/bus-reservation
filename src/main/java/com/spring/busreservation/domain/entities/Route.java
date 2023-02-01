package com.spring.busreservation.domain.entities;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Route extends AbstractEntity {
	


		private String source;
		private String destination;
		private Date date;
		 

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		 
	}

 
