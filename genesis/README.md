# Genesis Files


## Besu

[Implement Phoneix EVM and Protocol Upgrades](https://github.com/hyperledger/besu/commit/c955f67da606be8a56866fad7c34ddbba8529ada)

### Genesis File Specific

#### Kotti 
[@80173d6fe62156013bf7b884c7b2882a059c67da/config/src/main/resources/kotti.json#L8-L9](https://github.com/hyperledger/besu/blame/80173d6fe62156013bf7b884c7b2882a059c67da/config/src/main/resources/kotti.json#L8-L9)

## Informative Links
https://github.com/ethereum/tests/pull/469
https://github.com/etclabscore/eth-x-chainspec/issues/4

## Genesis Schema
[@ehildenb/ethereum-tests/tree/genesis-schema](https://github.com/ehildenb/ethereum-tests/tree/genesis-schema)
`./retesteth -t compatibility/genesis`

### Read More
[@retesteth/wiki/RPC-Methods#test_setchainparams](https://github.com/ethereum/retesteth/wiki/RPC-Methods#test_setchainparams)


## References 
> * [paritytech/parity-ethereum#11305 (files)](https://github.com/paritytech/parity-ethereum/pull/11305/files)
> * [ethereum/retesteth#69](https://github.com/ethereum/retesteth/issues/69)
>   
>   * [notes.ethereum.org/@holiman/S1ELAYY7S?type=view](https://notes.ethereum.org/@holiman/S1ELAYY7S?type=view)
> * [ethereum/retesteth#63](https://github.com/ethereum/retesteth/issues/63)
> * [ethereum/retesteth#62](https://github.com/ethereum/retesteth/issues/62)
> * [ethereum/retesteth/wiki/RPC-Methods#test_setchainparams](https://github.com/ethereum/retesteth/wiki/RPC-Methods#test_setchainparams)
>   > The method accepts a single argument which is a genesis.json contents. Similar to genesis config files. But the format is yet to be designed and greed to be universal.
>   > Discussion EIP: [ethereum/EIPs#1085](https://github.com/ethereum/EIPs/issues/1085)
>   > Specification: [ethereum/retesteth#4](https://github.com/ethereum/retesteth/issues/4)
>   > Schemas: [ethereum/tests#469](https://github.com/ethereum/tests/pull/469)

> * [multi-geth/multi-geth#91 (comment)](https://github.com/multi-geth/multi-geth/issues/91#issuecomment-496588091)
> * [paritytech/parity-ethereum@`1871275`/ethcore/src/client/evm_test_client.rs#L98](https://github.com/paritytech/parity-ethereum/blob/1871275ecdf02431bf67d09a1b25be8ff8916e3a/ethcore/src/client/evm_test_client.rs#L98)
> * [paritytech/parity-ethereum@`0199acb`/ethcore/src/ethereum/mod.rs#L129](https://github.com/paritytech/parity-ethereum/blob/0199acbece836c49e07410796c40c185e9051451/ethcore/src/ethereum/mod.rs#L129)
> * [paritytech/parity-ethereum@`0024966`/ethcore/src/json_tests/state.rs#L132](https://github.com/paritytech/parity-ethereum/blob/002496603c18234f129ba99fbe3659dd927bf05b/ethcore/src/json_tests/state.rs#L132)
> * [ethereum/tests](https://github.com/ethereum/tests)
> * [wiki.parity.io/Chain-specification.html](https://wiki.parity.io/Chain-specification.html)
> * [keorn/parity-spec](https://github.com/keorn/parity-spec)
> * [EIPS-1085](https://github.com/ethereum/EIPs/issues/1085)
