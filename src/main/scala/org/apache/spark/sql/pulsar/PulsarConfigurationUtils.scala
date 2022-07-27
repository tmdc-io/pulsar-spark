/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.spark.sql.pulsar

//import org.apache.pulsar.client.impl.conf.ConsumerConfigurationData
//import scala.reflect.runtime.universe._

object PulsarConfigurationUtils {

  //  private def nonIgnoredFields[T: TypeTag] = {
  //    // a field is a Term that is a Var or a Val
  //    val fields = typeOf[T].members.collect { case s: TermSymbol => s }.
  //      filter(s => s.isVal || s.isVar)
  //
  //    // then only keep the ones without a JsonIgnore annotation
  //    val ignores = fields.flatMap(f => f.annotations.find(_.tree.tpe =:= typeOf[JsonIgnore]).
  //      map((f, _))).map(t => t._1).toList
  //
  //    fields.filterNot(ignores.contains).map(_.name.toString)
  //  }
  //
  //  private def insensitive2Sensitive[T: TypeTag]: Map[String, String] = {
  //    nonIgnoredFields[T].map(s => s.toLowerCase(Locale.ROOT) -> s).toMap
  //  }

  //  val clientConfKeys = insensitive2Sensitive[ClientConfigurationData]
  //  val producerConfKeys = insensitive2Sensitive[ProducerConfigurationData]
//  val consumerConfKeys = insensitive2Sensitive[ConsumerConfigurationData[_]]
  //  val readerConfKeys = insensitive2Sensitive[ReaderConfigurationData[_]]

  val clientConfKeys: Map[String, String] = Map(
    "serviceUrl".toLowerCase -> "serviceUrl",
    "serviceUrlProvider".toLowerCase -> "serviceUrlProvider",
    "authentication".toLowerCase -> "authentication",
    "authPluginClassName".toLowerCase -> "authPluginClassName",
    "authParams".toLowerCase -> "authParams",
    "authParamMap".toLowerCase -> "authParamMap",
    "operationTimeoutMs".toLowerCase -> "operationTimeoutMs",
    "lookupTimeoutMs".toLowerCase -> "lookupTimeoutMs",
    "statsIntervalSeconds".toLowerCase -> "statsIntervalSeconds",
    "numIoThreads".toLowerCase -> "numIoThreads",
    "numListenerThreads".toLowerCase -> "numListenerThreads",
    "connectionsPerBroker".toLowerCase -> "connectionsPerBroker",
    "useTcpNoDelay".toLowerCase -> "useTcpNoDelay",
    "useTls".toLowerCase -> "useTls",
    "tlsTrustCertsFilePath".toLowerCase -> "tlsTrustCertsFilePath",
    "tlsAllowInsecureConnection".toLowerCase -> "tlsAllowInsecureConnection",
    "tlsHostnameVerificationEnable".toLowerCase -> "tlsHostnameVerificationEnable",
    "concurrentLookupRequest".toLowerCase -> "concurrentLookupRequest",
    "maxLookupRequest".toLowerCase -> "maxLookupRequest",
    "maxLookupRedirects".toLowerCase -> "maxLookupRedirects",
    "maxNumberOfRejectedRequestPerConnection".toLowerCase -> "maxNumberOfRejectedRequestPerConnection",
    "keepAliveIntervalSeconds".toLowerCase -> "keepAliveIntervalSeconds",
    "connectionTimeoutMs".toLowerCase -> "connectionTimeoutMs",
    "requestTimeoutMs".toLowerCase -> "requestTimeoutMs",
    "initialBackoffIntervalNanos".toLowerCase -> "initialBackoffIntervalNanos",
    "maxBackoffIntervalNanos".toLowerCase -> "maxBackoffIntervalNanos",
    "enableBusyWait".toLowerCase -> "enableBusyWait",
    "listenerName".toLowerCase -> "listenerName",
    "useKeyStoreTls".toLowerCase -> "useKeyStoreTls",
    "sslProvider".toLowerCase -> "sslProvider",
    "tlsTrustStoreType".toLowerCase -> "tlsTrustStoreType",
    "tlsTrustStorePath".toLowerCase -> "tlsTrustStorePath",
    "tlsTrustStorePassword".toLowerCase -> "tlsTrustStorePassword",
    "tlsCiphers".toLowerCase -> "tlsCiphers",
    "tlsProtocols".toLowerCase -> "tlsProtocols",
    "memoryLimitBytes".toLowerCase -> "memoryLimitBytes",
    "proxyServiceUrl".toLowerCase -> "proxyServiceUrl",
    "proxyProtocol".toLowerCase -> "proxyProtocol",
    "enableTransaction".toLowerCase -> "enableTransaction",
    "socks5ProxyAddress".toLowerCase -> "socks5ProxyAddress",
    "socks5ProxyUsername".toLowerCase -> "socks5ProxyUsername",
    "socks5ProxyUsername".toLowerCase -> "socks5ProxyUsername")

  val producerConfKeys: Map[String, String] = Map(
    "topicName".toLowerCase -> "topicName",
    "producerName".toLowerCase -> "producerName",
    "sendTimeoutMs".toLowerCase -> "sendTimeoutMs",
    "blockIfQueueFull".toLowerCase -> "blockIfQueueFull",
    "maxPendingMessages".toLowerCase -> "maxPendingMessages",
    "maxPendingMessagesAcrossPartitions".toLowerCase -> "maxPendingMessagesAcrossPartitions",
    "messageRoutingMode".toLowerCase -> "messageRoutingMode",
    "hashingScheme".toLowerCase -> "hashingScheme",
    "cryptoFailureAction".toLowerCase -> "cryptoFailureAction",
    "customMessageRouter".toLowerCase -> "customMessageRouter",
    "batchingMaxPublishDelayMicros".toLowerCase -> "batchingMaxPublishDelayMicros",
    "batchingPartitionSwitchFrequencyByPublishDelay".toLowerCase -> "batchingPartitionSwitchFrequencyByPublishDelay",
    "batchingMaxMessages".toLowerCase -> "batchingMaxMessages",
    "batchingMaxBytes".toLowerCase -> "batchingMaxBytes",
    "batchingEnabled".toLowerCase -> "batchingEnabled",
    "batcherBuilder".toLowerCase -> "batcherBuilder",
    "chunkingEnabled".toLowerCase -> "chunkingEnabled",
    "cryptoKeyReader".toLowerCase -> "cryptoKeyReader",
    "messageCrypto".toLowerCase -> "messageCrypto",
    "compressionType".toLowerCase -> "compressionType",
    "initialSequenceId".toLowerCase -> "initialSequenceId",
    "autoUpdatePartitions".toLowerCase -> "autoUpdatePartitions",
    "autoUpdatePartitionsIntervalSeconds".toLowerCase -> "autoUpdatePartitionsIntervalSeconds",
    "multiSchema".toLowerCase -> "multiSchema",
    "accessMode".toLowerCase -> "accessMode",
    "lazyStartPartitionedProducers".toLowerCase -> "lazyStartPartitionedProducers"
  )

  val readerConfKeys: Map[String, String] = Map(
    "topicNames".toLowerCase -> "topicNames",
    "startMessageId".toLowerCase -> "startMessageId",
    "receiverQueueSize".toLowerCase -> "receiverQueueSize",
    "readerListener".toLowerCase -> "readerListener",
    "readerName".toLowerCase -> "readerName",
    "subscriptionRolePrefix".toLowerCase -> "subscriptionRolePrefix",
    "subscriptionName".toLowerCase -> "subscriptionName",
    "cryptoKeyReader".toLowerCase -> "cryptoKeyReader",
    "cryptoFailureAction".toLowerCase -> "cryptoFailureAction",
    "readCompacted".toLowerCase -> "readCompacted",
    "resetIncludeHead".toLowerCase -> "resetIncludeHead",
    "keyHashRanges".toLowerCase -> "keyHashRanges",
    "poolMessages".toLowerCase -> "poolMessages"
  )
  val consumerConfKeys = Map(
    "topicsPattern".toLowerCase -> "topicsPattern",
    "subscriptionName".toLowerCase -> "subscriptionName",
    "subscriptionType".toLowerCase -> "subscriptionType",
    "subscriptionMode".toLowerCase -> "subscriptionMode",
    "receiverQueueSize".toLowerCase -> "receiverQueueSize",
    "acknowledgementsGroupTimeMicros".toLowerCase -> "acknowledgementsGroupTimeMicros",
    "negativeAckRedeliveryDelayMicros".toLowerCase -> "negativeAckRedeliveryDelayMicros",
    "maxTotalReceiverQueueSizeAcrossPartitions".toLowerCase -> "maxTotalReceiverQueueSizeAcrossPartitions",
    "consumerName".toLowerCase -> "consumerName",
    "ackTimeoutMillis".toLowerCase -> "ackTimeoutMillis",
    "tickDurationMillis".toLowerCase -> "tickDurationMillis",
    "priorityLevel".toLowerCase -> "priorityLevel",
    "maxPendingChunkedMessage".toLowerCase -> "maxPendingChunkedMessage",
    "autoAckOldestChunkedMessageOnQueueFull".toLowerCase -> "autoAckOldestChunkedMessageOnQueueFull",
    "expireTimeOfIncompleteChunkedMessageMillis".toLowerCase -> "expireTimeOfIncompleteChunkedMessageMillis",
    "cryptoFailureAction".toLowerCase -> "cryptoFailureAction",
    "properties".toLowerCase -> "properties",
    "readCompacted".toLowerCase -> "readCompacted",
    "subscriptionInitialPosition".toLowerCase -> "subscriptionInitialPosition",
    "patternAutoDiscoveryPeriod".toLowerCase -> "patternAutoDiscoveryPeriod",
    "regexSubscriptionMode".toLowerCase -> "regexSubscriptionMode",
    "deadLetterPolicy".toLowerCase -> "deadLetterPolicy",
    "retryEnable".toLowerCase -> "retryEnable",
    "autoUpdatePartitions".toLowerCase -> "autoUpdatePartitions",
    "autoUpdatePartitionsIntervalSeconds".toLowerCase -> "autoUpdatePartitionsIntervalSeconds",
    "replicateSubscriptionState".toLowerCase -> "replicateSubscriptionState",
    "resetIncludeHead".toLowerCase -> "resetIncludeHead",
    "keySharedPolicy".toLowerCase -> "keySharedPolicy",
    "batchIndexAckEnabled".toLowerCase -> "batchIndexAckEnabled",
    "ackReceiptEnabled".toLowerCase -> "ackReceiptEnabled",
    "poolMessages".toLowerCase -> "poolMessages"
  )
}
