/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.QueryPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPriceResponse extends AcsResponse {

	private String requestId;

	private String emrPrice;

	private String ecsPrice;

	private EmrPriceDO emrPriceDO;

	private EcsPriceDO ecsPriceDO;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEmrPrice() {
		return this.emrPrice;
	}

	public void setEmrPrice(String emrPrice) {
		this.emrPrice = emrPrice;
	}

	public String getEcsPrice() {
		return this.ecsPrice;
	}

	public void setEcsPrice(String ecsPrice) {
		this.ecsPrice = ecsPrice;
	}

	public EmrPriceDO getEmrPriceDO() {
		return this.emrPriceDO;
	}

	public void setEmrPriceDO(EmrPriceDO emrPriceDO) {
		this.emrPriceDO = emrPriceDO;
	}

	public EcsPriceDO getEcsPriceDO() {
		return this.ecsPriceDO;
	}

	public void setEcsPriceDO(EcsPriceDO ecsPriceDO) {
		this.ecsPriceDO = ecsPriceDO;
	}

	public static class EmrPriceDO {

		private String originalPrice;

		private String discountPrice;

		private String tradePrice;

		public String getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(String originalPrice) {
			this.originalPrice = originalPrice;
		}

		public String getDiscountPrice() {
			return this.discountPrice;
		}

		public void setDiscountPrice(String discountPrice) {
			this.discountPrice = discountPrice;
		}

		public String getTradePrice() {
			return this.tradePrice;
		}

		public void setTradePrice(String tradePrice) {
			this.tradePrice = tradePrice;
		}
	}

	public static class EcsPriceDO {

		private String originalPrice;

		private String discountPrice;

		private String tradePrice;

		public String getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(String originalPrice) {
			this.originalPrice = originalPrice;
		}

		public String getDiscountPrice() {
			return this.discountPrice;
		}

		public void setDiscountPrice(String discountPrice) {
			this.discountPrice = discountPrice;
		}

		public String getTradePrice() {
			return this.tradePrice;
		}

		public void setTradePrice(String tradePrice) {
			this.tradePrice = tradePrice;
		}
	}

	@Override
	public QueryPriceResponse getInstance(UnmarshallerContext context) {
		return	QueryPriceResponseUnmarshaller.unmarshall(this, context);
	}
}
