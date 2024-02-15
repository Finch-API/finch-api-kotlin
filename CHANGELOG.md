# Changelog

## 0.0.1 (2024-02-15)

Full Changelog: [...abc-v0.0.1](https://github.com/Finch-API/finch-api-kotlin/compare/...abc-v0.0.1)

### Features

* **api:** add `/forward` endpoint and other updates ([#16](https://github.com/Finch-API/finch-api-kotlin/issues/16)) ([a4838f4](https://github.com/Finch-API/finch-api-kotlin/commit/a4838f4d211477be2c8f05b5923bef84ebda5aa1))
* **api:** add `/jobs` endpoints ([#50](https://github.com/Finch-API/finch-api-kotlin/issues/50)) ([0685727](https://github.com/Finch-API/finch-api-kotlin/commit/06857275dc2a409908ba41217e990c6d5a7ffdcb))
* **api:** add `client_type` and `connection_type` to introspection ([#52](https://github.com/Finch-API/finch-api-kotlin/issues/52)) ([18097b8](https://github.com/Finch-API/finch-api-kotlin/commit/18097b87ede8c4496bfe8bebfdfc59ed3bb3a8df))
* **api:** add `lp` tax payer type enum value ([#55](https://github.com/Finch-API/finch-api-kotlin/issues/55)) ([cd69cd6](https://github.com/Finch-API/finch-api-kotlin/commit/cd69cd6b9e520bbba6d8a81160a2c24eb7a83ef8))
* **api:** add employer_contributions field ([#75](https://github.com/Finch-API/finch-api-kotlin/issues/75)) ([f49885e](https://github.com/Finch-API/finch-api-kotlin/commit/f49885e600d17572d0219932f5209dacdcc2101d))
* **api:** add method to create access token ([#62](https://github.com/Finch-API/finch-api-kotlin/issues/62)) ([bf67c78](https://github.com/Finch-API/finch-api-kotlin/commit/bf67c78992ce57d01dc090feb4bd05ecade2d811))
* **api:** add sandbox APIs ([#64](https://github.com/Finch-API/finch-api-kotlin/issues/64)) ([6d22c33](https://github.com/Finch-API/finch-api-kotlin/commit/6d22c33e452760700542c3ff357570fc37b5031a))
* **api:** create access token reads client opts if not provided ([#83](https://github.com/Finch-API/finch-api-kotlin/issues/83)) ([df44587](https://github.com/Finch-API/finch-api-kotlin/commit/df445878ef13c05f3c8bb9e967fbc3d7116a7396))
* **api:** updates ([#43](https://github.com/Finch-API/finch-api-kotlin/issues/43)) ([b8e3bdc](https://github.com/Finch-API/finch-api-kotlin/commit/b8e3bdc15639e9a6358548a635cfb1f80ad9841c))
* **api:** updates ([#47](https://github.com/Finch-API/finch-api-kotlin/issues/47)) ([7eb95ae](https://github.com/Finch-API/finch-api-kotlin/commit/7eb95aea20486e62c9078d5dfe8bf07cd7a48ad0))
* **ci:** add reviewers ([#9](https://github.com/Finch-API/finch-api-kotlin/issues/9)) ([5283514](https://github.com/Finch-API/finch-api-kotlin/commit/5283514c2fe09916dec9491abe3608b9ce0ffc1c))
* **client:** adjust retry behavior ([#32](https://github.com/Finch-API/finch-api-kotlin/issues/32)) ([ae371cd](https://github.com/Finch-API/finch-api-kotlin/commit/ae371cd0dbf9f3c71c79dda4c094b2427947898c))
* **client:** allow binary returns ([#38](https://github.com/Finch-API/finch-api-kotlin/issues/38)) ([fdaf69a](https://github.com/Finch-API/finch-api-kotlin/commit/fdaf69a7d2c75ca5f7465f4a1d1c6261a53440fd))
* **client:** hook up sandbox auth ([#68](https://github.com/Finch-API/finch-api-kotlin/issues/68)) ([a549eea](https://github.com/Finch-API/finch-api-kotlin/commit/a549eeac2c38ed354a3825f274f97ec4c6917219))
* **client:** retry on 408 Request Timeout ([#5](https://github.com/Finch-API/finch-api-kotlin/issues/5)) ([669fc9c](https://github.com/Finch-API/finch-api-kotlin/commit/669fc9cfbadac0571b0a317f4728fb20f273b944))
* **github:** include a devcontainer setup ([#36](https://github.com/Finch-API/finch-api-kotlin/issues/36)) ([f903e7a](https://github.com/Finch-API/finch-api-kotlin/commit/f903e7a33cb3782b731803596b19f0e4444f0bff))
* **init:** initial commit ([670bd4e](https://github.com/Finch-API/finch-api-kotlin/commit/670bd4ea3631f0537cf7df789aa2176f9580faed))
* make webhook headers case insensitive ([#27](https://github.com/Finch-API/finch-api-kotlin/issues/27)) ([92690b7](https://github.com/Finch-API/finch-api-kotlin/commit/92690b7eb3cd045c56d67e088f8e7138ee0b7670))
* remove redundant endpoint, add sandbox client options (not yet used) ([#67](https://github.com/Finch-API/finch-api-kotlin/issues/67)) ([fcf6d8f](https://github.com/Finch-API/finch-api-kotlin/commit/fcf6d8f954ba81ddb3f8839056294de9906c6d39))
* **webhooks:** add types to the `unwrap` method ([#69](https://github.com/Finch-API/finch-api-kotlin/issues/69)) ([0e43c2d](https://github.com/Finch-API/finch-api-kotlin/commit/0e43c2d066d5055ec50b69f251cd3bcba5a0fa80))


### Bug Fixes

* **api:** fix authentication_type enum ([#76](https://github.com/Finch-API/finch-api-kotlin/issues/76)) ([770fdfa](https://github.com/Finch-API/finch-api-kotlin/commit/770fdfa2373794fb112e3268adccf3965249daf4))
* **api:** update `employer_size` parameter to `employee_size` ([#78](https://github.com/Finch-API/finch-api-kotlin/issues/78)) ([33fc617](https://github.com/Finch-API/finch-api-kotlin/commit/33fc617f8af0d87d7f9d08d7b9d3b336f9207af4))
* correct benfits to benefits ([#22](https://github.com/Finch-API/finch-api-kotlin/issues/22)) ([f6d8c92](https://github.com/Finch-API/finch-api-kotlin/commit/f6d8c9236e289cc56a437aa46f8e957aa08faac2))
* **pagination:** correct hasNextPage check ([#81](https://github.com/Finch-API/finch-api-kotlin/issues/81)) ([06ae02f](https://github.com/Finch-API/finch-api-kotlin/commit/06ae02fab91258561a010a3d53d79257b5b22bd2))

## 0.16.0 (2024-02-02)

Full Changelog: [v0.15.2...v0.16.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.15.2...v0.16.0)

### Features

* **api:** create access token reads client opts if not provided ([#83](https://github.com/Finch-API/finch-api-kotlin/issues/83)) ([4f732c1](https://github.com/Finch-API/finch-api-kotlin/commit/4f732c1a0edc2d97b2845065eb0ca98f23ae8525))


### Bug Fixes

* **pagination:** correct hasNextPage check ([#81](https://github.com/Finch-API/finch-api-kotlin/issues/81)) ([d39149b](https://github.com/Finch-API/finch-api-kotlin/commit/d39149bb61581db9b6fdae5f2bf9d71880f5e43e))


### Chores

* **interal:** make link to api.md relative ([#84](https://github.com/Finch-API/finch-api-kotlin/issues/84)) ([9b52b78](https://github.com/Finch-API/finch-api-kotlin/commit/9b52b7886dff96aedd2768a58b2c493eeb803f58))

## 0.15.2 (2024-01-30)

Full Changelog: [v0.15.1...v0.15.2](https://github.com/Finch-API/finch-api-kotlin/compare/v0.15.1...v0.15.2)

### Chores

* **internal:** support pre-release versioning ([#79](https://github.com/Finch-API/finch-api-kotlin/issues/79)) ([0887da9](https://github.com/Finch-API/finch-api-kotlin/commit/0887da96777aeba800a7a87cd8ed6dc70223b0f6))

## 0.15.1 (2024-01-29)

Full Changelog: [v0.15.0...v0.15.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.15.0...v0.15.1)

### Bug Fixes

* **api:** fix authentication_type enum ([#76](https://github.com/Finch-API/finch-api-kotlin/issues/76)) ([dcc1a37](https://github.com/Finch-API/finch-api-kotlin/commit/dcc1a37b5d4000d60f15e7805c7e9a8f13adf86f))
* **api:** update `employer_size` parameter to `employee_size` ([#78](https://github.com/Finch-API/finch-api-kotlin/issues/78)) ([a6e3dd9](https://github.com/Finch-API/finch-api-kotlin/commit/a6e3dd9e9c987993db16d970e4ac84c28babb92d))

## 0.15.0 (2024-01-18)

Full Changelog: [v0.14.0...v0.15.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.14.0...v0.15.0)

### Features

* **api:** add employer_contributions field ([#75](https://github.com/Finch-API/finch-api-kotlin/issues/75)) ([4243525](https://github.com/Finch-API/finch-api-kotlin/commit/4243525367d92d91362c88be91840c1c9ff122e1))


### Chores

* **ci:** rely on Stainless GitHub App for releases ([#74](https://github.com/Finch-API/finch-api-kotlin/issues/74)) ([825eca2](https://github.com/Finch-API/finch-api-kotlin/commit/825eca2770aeae31f021ac3e741135a35392603a))
* **internal:** speculative retry-after-ms support ([#72](https://github.com/Finch-API/finch-api-kotlin/issues/72)) ([b7fbb9a](https://github.com/Finch-API/finch-api-kotlin/commit/b7fbb9aed5066de445204e235b233f8dba659e90))

## 0.14.0 (2024-01-12)

Full Changelog: [v0.13.0...v0.14.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.13.0...v0.14.0)

### Features

* **webhooks:** add types to the `unwrap` method ([#69](https://github.com/Finch-API/finch-api-kotlin/issues/69)) ([69cc98f](https://github.com/Finch-API/finch-api-kotlin/commit/69cc98fa2b5a666bbfc5163dd2f2604efbb17ea9))


### Documentation

* **readme:** improve api reference ([#71](https://github.com/Finch-API/finch-api-kotlin/issues/71)) ([4bd255f](https://github.com/Finch-API/finch-api-kotlin/commit/4bd255f3885a7ff5fa34e3a43467e74d3766cd04))

## 0.13.0 (2024-01-11)

Full Changelog: [v0.12.0...v0.13.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.12.0...v0.13.0)

### Features

* **client:** hook up sandbox auth ([#68](https://github.com/Finch-API/finch-api-kotlin/issues/68)) ([822710c](https://github.com/Finch-API/finch-api-kotlin/commit/822710cb82a2e20d2114e6afbf076c55a4920a00))
* remove redundant endpoint, add sandbox client options (not yet used) ([#67](https://github.com/Finch-API/finch-api-kotlin/issues/67)) ([ab01b16](https://github.com/Finch-API/finch-api-kotlin/commit/ab01b16b81f2be80c5b2080d5e42e87507aa5988))


### Chores

* **internal:** rename unreleased connection status type ([#65](https://github.com/Finch-API/finch-api-kotlin/issues/65)) ([7c99a67](https://github.com/Finch-API/finch-api-kotlin/commit/7c99a679d5e263a9d3fcd7ef8b214cf9e4bf3589))

## 0.12.0 (2024-01-09)

Full Changelog: [v0.11.1...v0.12.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.11.1...v0.12.0)

### Features

* **api:** add method to create access token ([#62](https://github.com/Finch-API/finch-api-kotlin/issues/62)) ([ca4e517](https://github.com/Finch-API/finch-api-kotlin/commit/ca4e517b121a1f706ed4684d7f127b0684e7962f))
* **api:** add sandbox APIs ([#64](https://github.com/Finch-API/finch-api-kotlin/issues/64)) ([57230a5](https://github.com/Finch-API/finch-api-kotlin/commit/57230a52723ed21b6806bc7575fed23cd58ba134))


### Chores

* add .keep files for examples and custom code directories ([#63](https://github.com/Finch-API/finch-api-kotlin/issues/63)) ([01b99ed](https://github.com/Finch-API/finch-api-kotlin/commit/01b99edc0e0b2549a7ab9f626464c361610ac8e5))
* **internal:** bump license ([#60](https://github.com/Finch-API/finch-api-kotlin/issues/60)) ([968fbcb](https://github.com/Finch-API/finch-api-kotlin/commit/968fbcbb72abda3976fcac1909653137699a42f8))

## 0.11.1 (2023-12-18)

Full Changelog: [v0.11.0...v0.11.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.11.0...v0.11.1)

### Chores

* **ci:** run release workflow once per day ([#57](https://github.com/Finch-API/finch-api-kotlin/issues/57)) ([8a49238](https://github.com/Finch-API/finch-api-kotlin/commit/8a49238dbf02ed61d77f730cf8d90e838e7467d9))


### Documentation

* replace &lt;br&gt; tags with newlines ([#59](https://github.com/Finch-API/finch-api-kotlin/issues/59)) ([587129a](https://github.com/Finch-API/finch-api-kotlin/commit/587129a66fa5c1b459c97b3a96434a9836cf938d))

## 0.11.0 (2023-12-07)

Full Changelog: [v0.10.0...v0.11.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.10.0...v0.11.0)

### Features

* **api:** add `lp` tax payer type enum value ([#55](https://github.com/Finch-API/finch-api-kotlin/issues/55)) ([e009e5f](https://github.com/Finch-API/finch-api-kotlin/commit/e009e5f67b94596a051208c476b804407b67a780))

## 0.10.0 (2023-12-06)

Full Changelog: [v0.9.0...v0.10.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.9.0...v0.10.0)

### Features

* **api:** add `client_type` and `connection_type` to introspection ([#52](https://github.com/Finch-API/finch-api-kotlin/issues/52)) ([a4428ae](https://github.com/Finch-API/finch-api-kotlin/commit/a4428ae2bc6d7a239093e5129b56808dc4e8be29))

## 0.9.0 (2023-12-04)

Full Changelog: [v0.8.1...v0.9.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.8.1...v0.9.0)

### Features

* **api:** add `/jobs` endpoints ([#50](https://github.com/Finch-API/finch-api-kotlin/issues/50)) ([5aaf719](https://github.com/Finch-API/finch-api-kotlin/commit/5aaf7198dfa2bcaa9eedf0e34b200ca82a7c7836))

## 0.8.1 (2023-12-04)

Full Changelog: [v0.8.0...v0.8.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.8.0...v0.8.1)

## 0.8.0 (2023-11-21)

Full Changelog: [v0.7.0...v0.8.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.7.0...v0.8.0)

### Features

* **api:** updates ([#47](https://github.com/Finch-API/finch-api-kotlin/issues/47)) ([02a9362](https://github.com/Finch-API/finch-api-kotlin/commit/02a9362b697a271b402c49e29e3893132698497c))


### Chores

* **internal:** update stats file ([#45](https://github.com/Finch-API/finch-api-kotlin/issues/45)) ([466d371](https://github.com/Finch-API/finch-api-kotlin/commit/466d3713dc432fa3dadb6d74bc8acd48a818d43b))

## 0.7.0 (2023-11-13)

Full Changelog: [v0.6.0...v0.7.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.6.0...v0.7.0)

### Features

* **api:** updates ([#43](https://github.com/Finch-API/finch-api-kotlin/issues/43)) ([ad7dda1](https://github.com/Finch-API/finch-api-kotlin/commit/ad7dda1f55ca1da31181a9b09d0280a49fecf796))

## 0.6.0 (2023-11-08)

Full Changelog: [v0.5.0...v0.6.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.5.0...v0.6.0)

### Features

* **client:** allow binary returns ([#38](https://github.com/Finch-API/finch-api-kotlin/issues/38)) ([d6545a1](https://github.com/Finch-API/finch-api-kotlin/commit/d6545a1e467b77ba3cc752372f72f88ac449e79a))


### Chores

* **docs:** fix some typos ([#41](https://github.com/Finch-API/finch-api-kotlin/issues/41)) ([fc1b433](https://github.com/Finch-API/finch-api-kotlin/commit/fc1b433cae85ddb89cbecf25fc7fa38edf2fb307))


### Documentation

* **readme:** improve example snippets ([#40](https://github.com/Finch-API/finch-api-kotlin/issues/40)) ([1f7941a](https://github.com/Finch-API/finch-api-kotlin/commit/1f7941affc9dd3ff610c98a72a827bf48110bd81))

## 0.5.0 (2023-11-07)

Full Changelog: [v0.4.0...v0.5.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.4.0...v0.5.0)

### Features

* **client:** allow binary returns ([#38](https://github.com/Finch-API/finch-api-kotlin/issues/38)) ([d6545a1](https://github.com/Finch-API/finch-api-kotlin/commit/d6545a1e467b77ba3cc752372f72f88ac449e79a))


### Chores

* **docs:** fix some typos ([#41](https://github.com/Finch-API/finch-api-kotlin/issues/41)) ([fc1b433](https://github.com/Finch-API/finch-api-kotlin/commit/fc1b433cae85ddb89cbecf25fc7fa38edf2fb307))


### Documentation

* **readme:** improve example snippets ([#40](https://github.com/Finch-API/finch-api-kotlin/issues/40)) ([1f7941a](https://github.com/Finch-API/finch-api-kotlin/commit/1f7941affc9dd3ff610c98a72a827bf48110bd81))

## 0.4.0 (2023-10-31)

Full Changelog: [v0.3.1...v0.4.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.3.1...v0.4.0)

### Features

* **github:** include a devcontainer setup ([#36](https://github.com/Finch-API/finch-api-kotlin/issues/36)) ([1812964](https://github.com/Finch-API/finch-api-kotlin/commit/1812964d5817df17b64470ab114ae7d64700e8c2))

## 0.3.1 (2023-10-24)

Full Changelog: [v0.3.0...v0.3.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.3.0...v0.3.1)

## 0.3.0 (2023-10-24)

Full Changelog: [v0.2.1...v0.3.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.2.1...v0.3.0)

### Features

* **client:** adjust retry behavior ([#32](https://github.com/Finch-API/finch-api-kotlin/issues/32)) ([c300d79](https://github.com/Finch-API/finch-api-kotlin/commit/c300d7929c21546086afcfa3a9323357e45402e7))

## 0.2.1 (2023-10-19)

Full Changelog: [v0.2.0...v0.2.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.2.0...v0.2.1)

## 0.2.0 (2023-10-18)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.1.0...v0.2.0)

### Features

* make webhook headers case insensitive ([#27](https://github.com/Finch-API/finch-api-kotlin/issues/27)) ([f024f71](https://github.com/Finch-API/finch-api-kotlin/commit/f024f7176bd78cc24771e23a1180feaa9be65cfc))


### Bug Fixes

* correct benfits to benefits ([#22](https://github.com/Finch-API/finch-api-kotlin/issues/22)) ([921dcbc](https://github.com/Finch-API/finch-api-kotlin/commit/921dcbcf65f2d8fe8dbdcb3a92f301a2770c16b4))


### Chores

* **internal:** minor reformatting ([#25](https://github.com/Finch-API/finch-api-kotlin/issues/25)) ([61277ac](https://github.com/Finch-API/finch-api-kotlin/commit/61277acc6080310008b4ef9bbe67a4b806439c44))
* **internal:** rearrange client arguments ([#24](https://github.com/Finch-API/finch-api-kotlin/issues/24)) ([8fa645a](https://github.com/Finch-API/finch-api-kotlin/commit/8fa645a529d3c060e15d47ef7c74242106d88676))


### Documentation

* organisation -&gt; organization (UK to US English) ([#28](https://github.com/Finch-API/finch-api-kotlin/issues/28)) ([669b99d](https://github.com/Finch-API/finch-api-kotlin/commit/669b99d0776e8d0e5dc29e699b54d1126b9ca265))

## 0.1.0 (2023-10-17)

Full Changelog: [v0.0.5...v0.1.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.0.5...v0.1.0)

### Features

* make webhook headers case insensitive ([#27](https://github.com/Finch-API/finch-api-kotlin/issues/27)) ([f024f71](https://github.com/Finch-API/finch-api-kotlin/commit/f024f7176bd78cc24771e23a1180feaa9be65cfc))


### Bug Fixes

* correct benfits to benefits ([#22](https://github.com/Finch-API/finch-api-kotlin/issues/22)) ([921dcbc](https://github.com/Finch-API/finch-api-kotlin/commit/921dcbcf65f2d8fe8dbdcb3a92f301a2770c16b4))


### Chores

* **internal:** minor reformatting ([#25](https://github.com/Finch-API/finch-api-kotlin/issues/25)) ([61277ac](https://github.com/Finch-API/finch-api-kotlin/commit/61277acc6080310008b4ef9bbe67a4b806439c44))
* **internal:** rearrange client arguments ([#24](https://github.com/Finch-API/finch-api-kotlin/issues/24)) ([8fa645a](https://github.com/Finch-API/finch-api-kotlin/commit/8fa645a529d3c060e15d47ef7c74242106d88676))


### Documentation

* organisation -&gt; organization (UK to US English) ([#28](https://github.com/Finch-API/finch-api-kotlin/issues/28)) ([669b99d](https://github.com/Finch-API/finch-api-kotlin/commit/669b99d0776e8d0e5dc29e699b54d1126b9ca265))

## 0.0.5 (2023-10-06)

Full Changelog: [v0.0.4...v0.0.5](https://github.com/finch-api/finch-api-kotlin/compare/v0.0.4...v0.0.5)

## 0.0.4 (2023-10-05)

Full Changelog: [v0.0.3...v0.0.4](https://github.com/Finch-API/finch-api-kotlin/compare/v0.0.3...v0.0.4)

### Features

* **api:** add `/forward` endpoint and other updates ([#16](https://github.com/Finch-API/finch-api-kotlin/issues/16)) ([a4838f4](https://github.com/Finch-API/finch-api-kotlin/commit/a4838f4d211477be2c8f05b5923bef84ebda5aa1))


### Chores

* **docs:** adjust some docstrings ([#17](https://github.com/Finch-API/finch-api-kotlin/issues/17)) ([49063d5](https://github.com/Finch-API/finch-api-kotlin/commit/49063d52cbd1e6d279d50c0978e235df334d6681))
* **docs:** adjust some docstrings ([#18](https://github.com/Finch-API/finch-api-kotlin/issues/18)) ([995d913](https://github.com/Finch-API/finch-api-kotlin/commit/995d91368dbb80aa9e12adb19aec8c7e6f853f4e))
* **internal:** add a top-level generated comment to each file ([#19](https://github.com/Finch-API/finch-api-kotlin/issues/19)) ([da285fa](https://github.com/Finch-API/finch-api-kotlin/commit/da285fa9a571ffea17eaf0aa752efa03f96e6f8a))

## 0.0.4 (2023-10-04)

Full Changelog: [v0.0.3...v0.0.4](https://github.com/Finch-API/finch-api-kotlin/compare/v0.0.3...v0.0.4)

### Features

* **api:** add `/forward` endpoint and other updates ([#16](https://github.com/Finch-API/finch-api-kotlin/issues/16)) ([1a2db24](https://github.com/Finch-API/finch-api-kotlin/commit/1a2db2439db6d3abce1396f3efc0c4fe5425160f))


### Chores

* **docs:** adjust some docstrings ([#17](https://github.com/Finch-API/finch-api-kotlin/issues/17)) ([20971af](https://github.com/Finch-API/finch-api-kotlin/commit/20971afeef2f285fdc500cfc070ce7fddeac0e91))
* **docs:** adjust some docstrings ([#18](https://github.com/Finch-API/finch-api-kotlin/issues/18)) ([32cb6c0](https://github.com/Finch-API/finch-api-kotlin/commit/32cb6c05f6ba56c4addcc1ff5452f55c5d28ec09))
* **internal:** add a top-level generated comment to each file ([#19](https://github.com/Finch-API/finch-api-kotlin/issues/19)) ([79a0ca0](https://github.com/Finch-API/finch-api-kotlin/commit/79a0ca0f8210a279fbea77ec89d8965397339f35))

## 0.0.3 (2023-09-25)

Full Changelog: [v0.0.2...v0.0.3](https://github.com/Finch-API/finch-api-kotlin/compare/v0.0.2...v0.0.3)

### Features

* **ci:** add reviewers ([#9](https://github.com/Finch-API/finch-api-kotlin/issues/9)) ([58af103](https://github.com/Finch-API/finch-api-kotlin/commit/58af103c8d9c793a6cc2a01dac46139d8090fe71))

## 0.0.2 (2023-09-19)

Full Changelog: [v0.0.1...v0.0.2](https://github.com/Finch-API/finch-api-kotlin/compare/v0.0.1...v0.0.2)

### Features

* **client:** retry on 408 Request Timeout ([#5](https://github.com/Finch-API/finch-api-kotlin/issues/5)) ([55f5fd6](https://github.com/Finch-API/finch-api-kotlin/commit/55f5fd6381bb2d2d02bb4b4ec31e24a45cc1da84))
* **init:** initial commit ([670bd4e](https://github.com/Finch-API/finch-api-kotlin/commit/670bd4ea3631f0537cf7df789aa2176f9580faed))


### Chores

* **api:** remove deprecated & unused ATS API ([#8](https://github.com/Finch-API/finch-api-kotlin/issues/8)) ([0b42c6c](https://github.com/Finch-API/finch-api-kotlin/commit/0b42c6c72b75c3e9f2b7542bb2866b71cb95f1fb))
