# Changelog

## 4.1.0 (2025-02-26)

Full Changelog: [v4.0.2...v4.1.0](https://github.com/Finch-API/finch-api-kotlin/compare/v4.0.2...v4.1.0)

### Features

* **api:** api update ([#383](https://github.com/Finch-API/finch-api-kotlin/issues/383)) ([1979ad1](https://github.com/Finch-API/finch-api-kotlin/commit/1979ad1f022c2671e5e0c14691db3ffc17b4709c))
* **client:** allow omitting params object when none required ([#384](https://github.com/Finch-API/finch-api-kotlin/issues/384)) ([0a9823d](https://github.com/Finch-API/finch-api-kotlin/commit/0a9823d8a374ec4e6b8fa2379239eb0c247327db))
* **client:** support `JsonField#asX()` for known values ([#372](https://github.com/Finch-API/finch-api-kotlin/issues/372)) ([52e9af1](https://github.com/Finch-API/finch-api-kotlin/commit/52e9af1bacdc2103de7fdef552409076c8f63747))
* **client:** update enum `asX` methods ([#371](https://github.com/Finch-API/finch-api-kotlin/issues/371)) ([43cce41](https://github.com/Finch-API/finch-api-kotlin/commit/43cce415d8da2dc25cd2218e482cba55e8f5c5dc))


### Bug Fixes

* **client:** mark some request bodies as optional ([#380](https://github.com/Finch-API/finch-api-kotlin/issues/380)) ([1e07ee4](https://github.com/Finch-API/finch-api-kotlin/commit/1e07ee49679232c6500846af3c5a9b0bd2d5c424))


### Chores

* **ci:** update gradle actions to v4 ([#376](https://github.com/Finch-API/finch-api-kotlin/issues/376)) ([f46e8d4](https://github.com/Finch-API/finch-api-kotlin/commit/f46e8d49b64a2614ed20b120fbf52956e5895fa2))
* **client:** remove checked exception related code ([#378](https://github.com/Finch-API/finch-api-kotlin/issues/378)) ([e9bb534](https://github.com/Finch-API/finch-api-kotlin/commit/e9bb53429ee802fe09791ef9a27ab2355873c117))
* **docs:** add faq to readme ([#379](https://github.com/Finch-API/finch-api-kotlin/issues/379)) ([8c10cff](https://github.com/Finch-API/finch-api-kotlin/commit/8c10cff3275a3010ff075b62e599bdab81461734))
* **docs:** reorganize readme ([#373](https://github.com/Finch-API/finch-api-kotlin/issues/373)) ([565415d](https://github.com/Finch-API/finch-api-kotlin/commit/565415d9847a1ff51fc3c5e31097c8415c429ecb))
* **internal:** add async service tests ([#385](https://github.com/Finch-API/finch-api-kotlin/issues/385)) ([bac77be](https://github.com/Finch-API/finch-api-kotlin/commit/bac77befec34928d0e4418ca61d0878115ce8725))
* **internal:** codegen related update ([#377](https://github.com/Finch-API/finch-api-kotlin/issues/377)) ([d3f1571](https://github.com/Finch-API/finch-api-kotlin/commit/d3f15719a368a25650b90ad5ae3c7cb2db316830))
* **internal:** get rid of configuration cache ([#375](https://github.com/Finch-API/finch-api-kotlin/issues/375)) ([92be5c4](https://github.com/Finch-API/finch-api-kotlin/commit/92be5c42ffffb6a4f685bded5ed31428a7432c6c))
* **internal:** improve sync service tests ([bac77be](https://github.com/Finch-API/finch-api-kotlin/commit/bac77befec34928d0e4418ca61d0878115ce8725))
* **internal:** make body class constructors private ([be1aa10](https://github.com/Finch-API/finch-api-kotlin/commit/be1aa10cf4cff6b4421f68b90bcedc70fbb124a2))
* **internal:** make body classes for multipart requests ([be1aa10](https://github.com/Finch-API/finch-api-kotlin/commit/be1aa10cf4cff6b4421f68b90bcedc70fbb124a2))
* **internal:** misc formatting changes ([be1aa10](https://github.com/Finch-API/finch-api-kotlin/commit/be1aa10cf4cff6b4421f68b90bcedc70fbb124a2))
* **internal:** optimize build and test perf ([5edf995](https://github.com/Finch-API/finch-api-kotlin/commit/5edf995e861371bfb817cb0ba475e07cd7279a16))
* **internal:** remove unnecessary non-null asserts in tests ([1e07ee4](https://github.com/Finch-API/finch-api-kotlin/commit/1e07ee49679232c6500846af3c5a9b0bd2d5c424))
* **internal:** rename internal body classes ([be1aa10](https://github.com/Finch-API/finch-api-kotlin/commit/be1aa10cf4cff6b4421f68b90bcedc70fbb124a2))
* **internal:** update formatter ([#368](https://github.com/Finch-API/finch-api-kotlin/issues/368)) ([5edf995](https://github.com/Finch-API/finch-api-kotlin/commit/5edf995e861371bfb817cb0ba475e07cd7279a16))
* **internal:** update formatting ([94e49ed](https://github.com/Finch-API/finch-api-kotlin/commit/94e49ed464836e89c8ec0be968d844543d0f19bd))
* **internal:** update some formatting in `Values.kt` ([52e9af1](https://github.com/Finch-API/finch-api-kotlin/commit/52e9af1bacdc2103de7fdef552409076c8f63747))
* **internal:** use `assertNotNull` in tests for type narrowing ([1e07ee4](https://github.com/Finch-API/finch-api-kotlin/commit/1e07ee49679232c6500846af3c5a9b0bd2d5c424))
* **internal:** use better test example values ([#370](https://github.com/Finch-API/finch-api-kotlin/issues/370)) ([be1aa10](https://github.com/Finch-API/finch-api-kotlin/commit/be1aa10cf4cff6b4421f68b90bcedc70fbb124a2))
* **test:** update some test values ([#366](https://github.com/Finch-API/finch-api-kotlin/issues/366)) ([bb7a194](https://github.com/Finch-API/finch-api-kotlin/commit/bb7a194175ef1a149df8b070233cbe51010e2a06))


### Documentation

* add immutability explanation to readme ([#381](https://github.com/Finch-API/finch-api-kotlin/issues/381)) ([3f492ff](https://github.com/Finch-API/finch-api-kotlin/commit/3f492ff9467a40e9cc668f4dea7de7ed58f51b53))
* add source file links to readme ([#382](https://github.com/Finch-API/finch-api-kotlin/issues/382)) ([0bec292](https://github.com/Finch-API/finch-api-kotlin/commit/0bec29282bf18b38be8f470295be10c2d62de5d3))
* readme parameter tweaks ([bac77be](https://github.com/Finch-API/finch-api-kotlin/commit/bac77befec34928d0e4418ca61d0878115ce8725))

## 4.0.2 (2025-02-12)

Full Changelog: [v4.0.1...v4.0.2](https://github.com/Finch-API/finch-api-kotlin/compare/v4.0.1...v4.0.2)

### Chores

* **internal:** codegen related update ([#363](https://github.com/Finch-API/finch-api-kotlin/issues/363)) ([c2e67e5](https://github.com/Finch-API/finch-api-kotlin/commit/c2e67e5f85a991a00b1c0a6df058dd3f832a11a7))

## 4.0.1 (2025-02-11)

Full Changelog: [v4.0.0...v4.0.1](https://github.com/Finch-API/finch-api-kotlin/compare/v4.0.0...v4.0.1)

### Chores

* **internal:** codegen related update ([#360](https://github.com/Finch-API/finch-api-kotlin/issues/360)) ([aa5775f](https://github.com/Finch-API/finch-api-kotlin/commit/aa5775f65fbe18341be4c8e47b0b875cf1250390))

## 4.0.0 (2025-02-05)

Full Changelog: [v3.3.0...v4.0.0](https://github.com/Finch-API/finch-api-kotlin/compare/v3.3.0...v4.0.0)

### ⚠ BREAKING CHANGES

* **client:** better union variant method and variable names ([#339](https://github.com/Finch-API/finch-api-kotlin/issues/339))

### Features

* **api:** api update ([#347](https://github.com/Finch-API/finch-api-kotlin/issues/347)) ([04d6a87](https://github.com/Finch-API/finch-api-kotlin/commit/04d6a873898c3d98514831634922f914d652ce7e))
* **api:** api update ([#355](https://github.com/Finch-API/finch-api-kotlin/issues/355)) ([9a726a4](https://github.com/Finch-API/finch-api-kotlin/commit/9a726a4e1c6ad6a4ea9777307e8caeb68d80113b))
* **api:** api update ([#356](https://github.com/Finch-API/finch-api-kotlin/issues/356)) ([7092a04](https://github.com/Finch-API/finch-api-kotlin/commit/7092a042cd80e9d90d1283408151341b8ba820fd))
* **client:** add `_queryParams` and `_headers` methods ([#348](https://github.com/Finch-API/finch-api-kotlin/issues/348)) ([04aaaa9](https://github.com/Finch-API/finch-api-kotlin/commit/04aaaa9523019e0fca68488b8952e0a37256bd1a))
* **client:** add `close` method ([#341](https://github.com/Finch-API/finch-api-kotlin/issues/341)) ([825e883](https://github.com/Finch-API/finch-api-kotlin/commit/825e883b3c61e26bc8ada110e3c85a5ad40141f6))
* **client:** better union variant method and variable names ([#339](https://github.com/Finch-API/finch-api-kotlin/issues/339)) ([e81ed75](https://github.com/Finch-API/finch-api-kotlin/commit/e81ed7546f0c0dd961c30dcb11195e88bdf6ba73))
* **client:** send client-side timeout headers ([#357](https://github.com/Finch-API/finch-api-kotlin/issues/357)) ([a6c35fb](https://github.com/Finch-API/finch-api-kotlin/commit/a6c35fb2649642eca7e1665298a8376331620626))


### Bug Fixes

* **api:** add missing `@MustBeClosed` annotations ([#358](https://github.com/Finch-API/finch-api-kotlin/issues/358)) ([3508adc](https://github.com/Finch-API/finch-api-kotlin/commit/3508adc927bfb80ee0416f82d04e51cab7a2b121))
* **api:** switch `CompletableFuture&lt;Void&gt;` to `CompletableFuture<Void?>` ([3508adc](https://github.com/Finch-API/finch-api-kotlin/commit/3508adc927bfb80ee0416f82d04e51cab7a2b121))
* **client:** add missing validation calls on response ([3508adc](https://github.com/Finch-API/finch-api-kotlin/commit/3508adc927bfb80ee0416f82d04e51cab7a2b121))
* **client:** always provide a body for `PATCH` methods ([3508adc](https://github.com/Finch-API/finch-api-kotlin/commit/3508adc927bfb80ee0416f82d04e51cab7a2b121))
* **client:** compiler errors ([#351](https://github.com/Finch-API/finch-api-kotlin/issues/351)) ([315a715](https://github.com/Finch-API/finch-api-kotlin/commit/315a715ceadea7880693bfadfdeafbc608899dbe))
* **client:** don't leak responses when retrying ([#352](https://github.com/Finch-API/finch-api-kotlin/issues/352)) ([b1c1eed](https://github.com/Finch-API/finch-api-kotlin/commit/b1c1eed8f35b4693e0bac5bccc59cfe0577e5efd))
* **client:** make some classes and constructors non-public ([#345](https://github.com/Finch-API/finch-api-kotlin/issues/345)) ([9f577fb](https://github.com/Finch-API/finch-api-kotlin/commit/9f577fb6ad6bb0b3f642dcb448e763e42ba7e17e))


### Chores

* add max retries to test ([#340](https://github.com/Finch-API/finch-api-kotlin/issues/340)) ([8a156a6](https://github.com/Finch-API/finch-api-kotlin/commit/8a156a671b87f3944e2bf3566412ebeec2f34498))
* **internal:** add and tweak check functions ([#333](https://github.com/Finch-API/finch-api-kotlin/issues/333)) ([a1f86a6](https://github.com/Finch-API/finch-api-kotlin/commit/a1f86a64cd9c5f4d576b5d941aad1620279191ca))
* **internal:** codegen related update ([#336](https://github.com/Finch-API/finch-api-kotlin/issues/336)) ([c5c9430](https://github.com/Finch-API/finch-api-kotlin/commit/c5c94303029e3a626bd835f1b62ef90948f0d4d7))
* **internal:** codegen related update ([#354](https://github.com/Finch-API/finch-api-kotlin/issues/354)) ([f29354f](https://github.com/Finch-API/finch-api-kotlin/commit/f29354fa8762b1b449fbfd77c5d13e4ecd7fb73a))
* **internal:** extract a `checkRequired` function ([#332](https://github.com/Finch-API/finch-api-kotlin/issues/332)) ([5935caa](https://github.com/Finch-API/finch-api-kotlin/commit/5935caa32c706c02239eaa12b7bd9e83a68c756c))
* **internal:** improve `RetryingHttpClientTest` ([#350](https://github.com/Finch-API/finch-api-kotlin/issues/350)) ([788ef10](https://github.com/Finch-API/finch-api-kotlin/commit/788ef10a6337cc0d0b9f86e84491b70509dcc1d0))
* **internal:** minor formatting/style changes ([3508adc](https://github.com/Finch-API/finch-api-kotlin/commit/3508adc927bfb80ee0416f82d04e51cab7a2b121))
* **internal:** remove some unnecessary `constructor` keywords ([9f577fb](https://github.com/Finch-API/finch-api-kotlin/commit/9f577fb6ad6bb0b3f642dcb448e763e42ba7e17e))
* **internal:** remove unused or unnecessary Gradle imports ([#329](https://github.com/Finch-API/finch-api-kotlin/issues/329)) ([185e8d4](https://github.com/Finch-API/finch-api-kotlin/commit/185e8d4692279092dbb7081690554471b1555f59))
* **internal:** rename some tests ([3508adc](https://github.com/Finch-API/finch-api-kotlin/commit/3508adc927bfb80ee0416f82d04e51cab7a2b121))
* **internal:** swap `checkNotNull` to `checkRequired` ([#338](https://github.com/Finch-API/finch-api-kotlin/issues/338)) ([b59e3d9](https://github.com/Finch-API/finch-api-kotlin/commit/b59e3d96bb509a58c5b18200fb272de4bef7e5ea))
* **internal:** tweak client options nullability handling ([a1f86a6](https://github.com/Finch-API/finch-api-kotlin/commit/a1f86a64cd9c5f4d576b5d941aad1620279191ca))
* **internal:** update some gradle formatting ([#331](https://github.com/Finch-API/finch-api-kotlin/issues/331)) ([2c357e4](https://github.com/Finch-API/finch-api-kotlin/commit/2c357e4fda18da5c41ca1aa8f98f39e2093d3376))
* simplify examples involving lists ([#334](https://github.com/Finch-API/finch-api-kotlin/issues/334)) ([05e5597](https://github.com/Finch-API/finch-api-kotlin/commit/05e559763038207867fbfba43e57f161ec90a7a6))


### Documentation

* `async` and `sync` method comments ([#344](https://github.com/Finch-API/finch-api-kotlin/issues/344)) ([dc20094](https://github.com/Finch-API/finch-api-kotlin/commit/dc2009480a1124f7bb48d2faf2fa654d8350c22c))
* add client documentation ([#343](https://github.com/Finch-API/finch-api-kotlin/issues/343)) ([ffc8d25](https://github.com/Finch-API/finch-api-kotlin/commit/ffc8d2578ba298837768183f96d15da1cefb0f1c))
* add sonatype readme badge ([#335](https://github.com/Finch-API/finch-api-kotlin/issues/335)) ([6806444](https://github.com/Finch-API/finch-api-kotlin/commit/680644410925b203ecc49c51c2020ff545cc4ba8))
* builder, enum, and union comments ([#346](https://github.com/Finch-API/finch-api-kotlin/issues/346)) ([c60ef22](https://github.com/Finch-API/finch-api-kotlin/commit/c60ef22ba308cace6e5c5251b1a4d51b23175536))
* fix incorrect additional properties info ([#353](https://github.com/Finch-API/finch-api-kotlin/issues/353)) ([14f8de0](https://github.com/Finch-API/finch-api-kotlin/commit/14f8de0b993ae413a95f492a2638a8142287f2e4))


### Refactors

* **internal:** extract request preparation logic ([04aaaa9](https://github.com/Finch-API/finch-api-kotlin/commit/04aaaa9523019e0fca68488b8952e0a37256bd1a))

## 3.3.0 (2025-01-13)

Full Changelog: [v3.2.0...v3.3.0](https://github.com/Finch-API/finch-api-kotlin/compare/v3.2.0...v3.3.0)

### Features

* **api:** api update ([#323](https://github.com/Finch-API/finch-api-kotlin/issues/323)) ([14fdd9c](https://github.com/Finch-API/finch-api-kotlin/commit/14fdd9cfec5a7ad293686c89d1166ff5bbf2c9d5))


### Chores

* **internal:** codegen related update ([#325](https://github.com/Finch-API/finch-api-kotlin/issues/325)) ([4a3a195](https://github.com/Finch-API/finch-api-kotlin/commit/4a3a19537b032085b9550cbe74b2778785672156))
* **internal:** fix up root `build.gradle.kts` formatting ([#326](https://github.com/Finch-API/finch-api-kotlin/issues/326)) ([628ef46](https://github.com/Finch-API/finch-api-kotlin/commit/628ef46495035b04c0fa2ece6170744d26e5657b))
* **internal:** remove unused Gradle imports ([#327](https://github.com/Finch-API/finch-api-kotlin/issues/327)) ([0a1b324](https://github.com/Finch-API/finch-api-kotlin/commit/0a1b32437ea63f88b301ea8c2be39c48c18a8cc5))

## 3.2.0 (2025-01-08)

Full Changelog: [v3.1.1...v3.2.0](https://github.com/Finch-API/finch-api-kotlin/compare/v3.1.1...v3.2.0)

### Features

* **client:** add various convenience setters to models ([#319](https://github.com/Finch-API/finch-api-kotlin/issues/319)) ([8d2ac5a](https://github.com/Finch-API/finch-api-kotlin/commit/8d2ac5aea6d94e90b63088b11fc22296681fe44e))
* **client:** allow setting arbitrary JSON for top-level body params ([8d2ac5a](https://github.com/Finch-API/finch-api-kotlin/commit/8d2ac5aea6d94e90b63088b11fc22296681fe44e))
* **client:** expose getters for `JsonField` of body params ([8d2ac5a](https://github.com/Finch-API/finch-api-kotlin/commit/8d2ac5aea6d94e90b63088b11fc22296681fe44e))


### Bug Fixes

* **client:** consistently throw on omitting required fields ([8d2ac5a](https://github.com/Finch-API/finch-api-kotlin/commit/8d2ac5aea6d94e90b63088b11fc22296681fe44e))
* **client:** convert `JsonField` containing list type to mutable in builder ([8d2ac5a](https://github.com/Finch-API/finch-api-kotlin/commit/8d2ac5aea6d94e90b63088b11fc22296681fe44e))


### Chores

* **internal:** codegen related update ([#321](https://github.com/Finch-API/finch-api-kotlin/issues/321)) ([a0433d7](https://github.com/Finch-API/finch-api-kotlin/commit/a0433d72596b91f1cc48159d15b13fd1a2ff3a1b))


### Styles

* **internal:** explicitly add some method return types ([8d2ac5a](https://github.com/Finch-API/finch-api-kotlin/commit/8d2ac5aea6d94e90b63088b11fc22296681fe44e))
* **internal:** move headers and query params setters below others ([8d2ac5a](https://github.com/Finch-API/finch-api-kotlin/commit/8d2ac5aea6d94e90b63088b11fc22296681fe44e))
* **internal:** simplify existing convenience setters on params ([8d2ac5a](https://github.com/Finch-API/finch-api-kotlin/commit/8d2ac5aea6d94e90b63088b11fc22296681fe44e))

## 3.1.1 (2025-01-07)

Full Changelog: [v3.1.0...v3.1.1](https://github.com/Finch-API/finch-api-kotlin/compare/v3.1.0...v3.1.1)

### Documentation

* add params class javadocs ([#316](https://github.com/Finch-API/finch-api-kotlin/issues/316)) ([2c5e284](https://github.com/Finch-API/finch-api-kotlin/commit/2c5e2847fcf6a4ca14c2544485cc237d57e54ba8))

## 3.1.0 (2025-01-07)

Full Changelog: [v3.0.0...v3.1.0](https://github.com/Finch-API/finch-api-kotlin/compare/v3.0.0...v3.1.0)

### Features

* **api:** manual updates ([#312](https://github.com/Finch-API/finch-api-kotlin/issues/312)) ([04943b0](https://github.com/Finch-API/finch-api-kotlin/commit/04943b03cdd586318e784e3e5f22a23f33247acf))

## 3.0.0 (2025-01-06)

Full Changelog: [v2.0.0...v3.0.0](https://github.com/Finch-API/finch-api-kotlin/compare/v2.0.0...v3.0.0)

### ⚠ BREAKING CHANGES

* **client:** switch query params objects to use `QueryParams` ([#302](https://github.com/Finch-API/finch-api-kotlin/issues/302))

### Bug Fixes

* **client:** allow passing null for nullable fields where missing ([#310](https://github.com/Finch-API/finch-api-kotlin/issues/310)) ([91b2080](https://github.com/Finch-API/finch-api-kotlin/commit/91b2080787df3b1a8878aca3109880d39bba8a2b))


### Chores

* **docs:** fix unused import ([#300](https://github.com/Finch-API/finch-api-kotlin/issues/300)) ([3f95d20](https://github.com/Finch-API/finch-api-kotlin/commit/3f95d201ed7277a510fb0c0e38d20069ddf9103b))
* **internal:** codegen related update ([#307](https://github.com/Finch-API/finch-api-kotlin/issues/307)) ([2eab057](https://github.com/Finch-API/finch-api-kotlin/commit/2eab057b855037bceeead1eeefee250654462084))
* **internal:** codegen related update ([#308](https://github.com/Finch-API/finch-api-kotlin/issues/308)) ([b09374c](https://github.com/Finch-API/finch-api-kotlin/commit/b09374c46221ab6cfb331416bc7b07ef760ad424))


### Styles

* **internal:** sort fields ([#309](https://github.com/Finch-API/finch-api-kotlin/issues/309)) ([e3069bf](https://github.com/Finch-API/finch-api-kotlin/commit/e3069bf0cde899197a8367497c9a0a09384478e2))


### Refactors

* **client:** switch query params objects to use `QueryParams` ([#302](https://github.com/Finch-API/finch-api-kotlin/issues/302)) ([511df62](https://github.com/Finch-API/finch-api-kotlin/commit/511df62ceb53fca07d94be24bbd86372b5265a0b))
* **internal:** use constructor to deserialize json ([#303](https://github.com/Finch-API/finch-api-kotlin/issues/303)) ([040c55b](https://github.com/Finch-API/finch-api-kotlin/commit/040c55b45a79d1e327d4bb0785c1b64d4150994d))

## 2.0.0 (2024-12-19)

Full Changelog: [v1.13.0...v2.0.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.13.0...v2.0.0)

### ⚠ BREAKING CHANGES

* **client:** numeric enum member type ([#283](https://github.com/Finch-API/finch-api-kotlin/issues/283))

### Features

* **api:** api update ([#281](https://github.com/Finch-API/finch-api-kotlin/issues/281)) ([7312af9](https://github.com/Finch-API/finch-api-kotlin/commit/7312af979a060c0be68609edc79b4beb3e585320))
* **api:** api update ([#282](https://github.com/Finch-API/finch-api-kotlin/issues/282)) ([e69c17b](https://github.com/Finch-API/finch-api-kotlin/commit/e69c17b98e316b46a5bbffadc2fe01a75e6901d6))
* **api:** api update ([#291](https://github.com/Finch-API/finch-api-kotlin/issues/291)) ([f475cda](https://github.com/Finch-API/finch-api-kotlin/commit/f475cdafd9a99707049aca51605f0ad73c8615c8))
* **api:** api update ([#295](https://github.com/Finch-API/finch-api-kotlin/issues/295)) ([0cab1cf](https://github.com/Finch-API/finch-api-kotlin/commit/0cab1cf160031c9f23d2e08a3db5c1844e24b100))


### Bug Fixes

* **client:** numeric enum member type ([#283](https://github.com/Finch-API/finch-api-kotlin/issues/283)) ([fc2c7b1](https://github.com/Finch-API/finch-api-kotlin/commit/fc2c7b14eb243c59f9074aee114d37a1252fde7a))


### Chores

* **docs:** add example project ([#299](https://github.com/Finch-API/finch-api-kotlin/issues/299)) ([1edf6a7](https://github.com/Finch-API/finch-api-kotlin/commit/1edf6a7678e6ed4757ec3c814ef3c1cb23fee286))
* **docs:** update readme ([#298](https://github.com/Finch-API/finch-api-kotlin/issues/298)) ([0add28f](https://github.com/Finch-API/finch-api-kotlin/commit/0add28f2c18b392feae53bac3196dbb338c43dba))
* **internal:** codegen related update ([#279](https://github.com/Finch-API/finch-api-kotlin/issues/279)) ([d452c47](https://github.com/Finch-API/finch-api-kotlin/commit/d452c47a35484d4b507ca48e66cf3d0957b86f58))
* **internal:** codegen related update ([#288](https://github.com/Finch-API/finch-api-kotlin/issues/288)) ([88f2494](https://github.com/Finch-API/finch-api-kotlin/commit/88f249416d434bbe6ef53d331860f7fb3ef36aeb))
* **internal:** remove unused and expand used wildcard imports ([#292](https://github.com/Finch-API/finch-api-kotlin/issues/292)) ([5c75886](https://github.com/Finch-API/finch-api-kotlin/commit/5c7588674a5bd66e21d96976b097d9a427bea5af))
* **internal:** remove unused and expand used wildcard imports ([#294](https://github.com/Finch-API/finch-api-kotlin/issues/294)) ([ff489d1](https://github.com/Finch-API/finch-api-kotlin/commit/ff489d1fb004c6869d248fc1fc9c69a4395e823f))
* **internal:** remove unused imports ([#287](https://github.com/Finch-API/finch-api-kotlin/issues/287)) ([0d53a33](https://github.com/Finch-API/finch-api-kotlin/commit/0d53a33a5d6388d7b9905da7986c01f130d38901))
* **test:** remove unused imports ([#289](https://github.com/Finch-API/finch-api-kotlin/issues/289)) ([b6a2588](https://github.com/Finch-API/finch-api-kotlin/commit/b6a25884f9ce242c4748548d5d3343de33e7660e))
* **test:** use `JsonValue` instead of `JsonString` ([#290](https://github.com/Finch-API/finch-api-kotlin/issues/290)) ([2bbd395](https://github.com/Finch-API/finch-api-kotlin/commit/2bbd39574118f00a70bd36e3653b11d0267db3a1))
* update example values in tests and docs ([#284](https://github.com/Finch-API/finch-api-kotlin/issues/284)) ([afdc50b](https://github.com/Finch-API/finch-api-kotlin/commit/afdc50b76c04464aec4648dc19c508c3ca5ccfc7))
* update parameter examples in tests and docs ([#297](https://github.com/Finch-API/finch-api-kotlin/issues/297)) ([c2b350e](https://github.com/Finch-API/finch-api-kotlin/commit/c2b350ec208409b0a2ac06895e2599f6ec96132f))


### Styles

* **internal:** make enum value definitions less verbose ([#285](https://github.com/Finch-API/finch-api-kotlin/issues/285)) ([f63f9ae](https://github.com/Finch-API/finch-api-kotlin/commit/f63f9ae3bea9a36a9e7940dc5b0fa1d938d1eaaf))
* **internal:** move enum identity methods to bottom of class ([#286](https://github.com/Finch-API/finch-api-kotlin/issues/286)) ([76b11a6](https://github.com/Finch-API/finch-api-kotlin/commit/76b11a6b7321ab137c173c9066ceb631d929647f))

## 1.13.0 (2024-11-27)

Full Changelog: [v1.12.1...v1.13.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.12.1...v1.13.0)

### Features

* **api:** api update ([#277](https://github.com/Finch-API/finch-api-kotlin/issues/277)) ([1bec0f7](https://github.com/Finch-API/finch-api-kotlin/commit/1bec0f7d6509cb6eeddb7c7ab5a0d340ff03eafc))
* derive gpg release key's id via gpg itself ([#276](https://github.com/Finch-API/finch-api-kotlin/issues/276)) ([1d906a7](https://github.com/Finch-API/finch-api-kotlin/commit/1d906a73715f0fc9d6ca62fa261711b3d9be4cab))


### Bug Fixes

* remove reference to removed deps 'guava' ([9935b97](https://github.com/Finch-API/finch-api-kotlin/commit/9935b971d1b719d2e4b1a99e49d1cf2d3253bb7f))


### Chores

* **internal:** codegen related update ([#272](https://github.com/Finch-API/finch-api-kotlin/issues/272)) ([d19ffaa](https://github.com/Finch-API/finch-api-kotlin/commit/d19ffaad26b2982daa7d9a32b855da1761b265d1))
* **internal:** update example values ([#274](https://github.com/Finch-API/finch-api-kotlin/issues/274)) ([5f56afa](https://github.com/Finch-API/finch-api-kotlin/commit/5f56afa28f1b3d98f037ac2641ab254dc21dcaae))
* publish to maven central portal ([#275](https://github.com/Finch-API/finch-api-kotlin/issues/275)) ([51ee512](https://github.com/Finch-API/finch-api-kotlin/commit/51ee5127661be6b46480d204c8c8dd4788f30b37))

## 1.12.1 (2024-11-21)

Full Changelog: [v1.12.0...v1.12.1](https://github.com/Finch-API/finch-api-kotlin/compare/v1.12.0...v1.12.1)

### Chores

* **internal:** codegen related update ([#270](https://github.com/Finch-API/finch-api-kotlin/issues/270)) ([2e97a6e](https://github.com/Finch-API/finch-api-kotlin/commit/2e97a6e5df0d62930833ff84fe613dcfd819a242))
* **internal:** version bump ([#268](https://github.com/Finch-API/finch-api-kotlin/issues/268)) ([10a744a](https://github.com/Finch-API/finch-api-kotlin/commit/10a744ada2a2ac57a02ed14371602af34104f941))

## 1.12.0 (2024-11-19)

Full Changelog: [v1.11.0...v1.12.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.11.0...v1.12.0)

### Features

* **api:** api update ([#265](https://github.com/Finch-API/finch-api-kotlin/issues/265)) ([48f5d98](https://github.com/Finch-API/finch-api-kotlin/commit/48f5d9829e13dbe3561d9e3ce7ed0e346d8de5cc))


### Chores

* rebuild project due to codegen change ([#261](https://github.com/Finch-API/finch-api-kotlin/issues/261)) ([2f0254b](https://github.com/Finch-API/finch-api-kotlin/commit/2f0254b65cd322e09494d55eb99f311d8b099b27))
* rebuild project due to codegen change ([#264](https://github.com/Finch-API/finch-api-kotlin/issues/264)) ([0d19b44](https://github.com/Finch-API/finch-api-kotlin/commit/0d19b44da53da385b507ec4b4d811292d34ff278))
* rebuild project due to codegen change ([#266](https://github.com/Finch-API/finch-api-kotlin/issues/266)) ([9a8b47b](https://github.com/Finch-API/finch-api-kotlin/commit/9a8b47b794c2f2a1b09ebe3ec88dfdaef2f7b601))

## 1.11.0 (2024-11-01)

Full Changelog: [v1.10.0...v1.11.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.10.0...v1.11.0)

### Features

* **api:** updates ([abe3067](https://github.com/Finch-API/finch-api-kotlin/commit/abe3067632e75ac46f8e9186695a365793cd83c2))

## 1.10.0 (2024-11-01)

Full Changelog: [v1.9.0...v1.10.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.9.0...v1.10.0)

### Features

* **api:** api update ([#255](https://github.com/Finch-API/finch-api-kotlin/issues/255)) ([616a711](https://github.com/Finch-API/finch-api-kotlin/commit/616a711a1c4e6bea263efa468cf26976a5f0c85d))

## 1.9.0 (2024-10-25)

Full Changelog: [v1.8.0...v1.9.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.8.0...v1.9.0)

### Features

* **api:** api update ([#248](https://github.com/Finch-API/finch-api-kotlin/issues/248)) ([049c24f](https://github.com/Finch-API/finch-api-kotlin/commit/049c24fc806c8a639adce58d065e56e025d688b9))
* **api:** api update ([#250](https://github.com/Finch-API/finch-api-kotlin/issues/250)) ([25a9189](https://github.com/Finch-API/finch-api-kotlin/commit/25a918988798810961ec5d728ddf69c33eb6a5b6))


### Chores

* **internal:** version bump ([#252](https://github.com/Finch-API/finch-api-kotlin/issues/252)) ([9b8e32c](https://github.com/Finch-API/finch-api-kotlin/commit/9b8e32c6a8b2cf8ea36533866673a2ebe6818b19))

## 1.8.0 (2024-10-10)

Full Changelog: [v1.7.0...v1.8.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.7.0...v1.8.0)

### Features

* **api:** api update ([#246](https://github.com/Finch-API/finch-api-kotlin/issues/246)) ([841cf13](https://github.com/Finch-API/finch-api-kotlin/commit/841cf132d575f2696e7e5cd3f1298067c9c46276))

## 1.7.0 (2024-10-03)

Full Changelog: [v1.6.0...v1.7.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.6.0...v1.7.0)

### Features

* **api:** api update ([#243](https://github.com/Finch-API/finch-api-kotlin/issues/243)) ([ef16a72](https://github.com/Finch-API/finch-api-kotlin/commit/ef16a72491bd46779f06962668645c754daece38))

## 1.6.0 (2024-10-02)

Full Changelog: [v1.5.0...v1.6.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.5.0...v1.6.0)

### Features

* **api:** manual updates ([#236](https://github.com/Finch-API/finch-api-kotlin/issues/236)) ([d426098](https://github.com/Finch-API/finch-api-kotlin/commit/d4260985f9048934d88da81981b37e20f75197db))
* **api:** manual updates ([#237](https://github.com/Finch-API/finch-api-kotlin/issues/237)) ([b3aac6e](https://github.com/Finch-API/finch-api-kotlin/commit/b3aac6ed0e557721f066e82c02bfcfbb8f8dd753))


### Chores

* **internal:** codegen related update ([#233](https://github.com/Finch-API/finch-api-kotlin/issues/233)) ([357e8bc](https://github.com/Finch-API/finch-api-kotlin/commit/357e8bc94bc1d7b96c4268af0e6292071bc87ed2))
* **internal:** codegen related update ([#238](https://github.com/Finch-API/finch-api-kotlin/issues/238)) ([7588c55](https://github.com/Finch-API/finch-api-kotlin/commit/7588c5557243a4b5936d456c87848cc6539f9651))
* **internal:** fix test ([57e3cae](https://github.com/Finch-API/finch-api-kotlin/commit/57e3caef3c5e64495d2fc55d4340f87e5c406654))
* **internal:** skip failing tests ([#235](https://github.com/Finch-API/finch-api-kotlin/issues/235)) ([83b4ce3](https://github.com/Finch-API/finch-api-kotlin/commit/83b4ce3f859e5c3f5ee3934bc44744c9ae2e7de7))

## 1.5.0 (2024-09-20)

Full Changelog: [v1.4.0...v1.5.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.4.0...v1.5.0)

### Features

* **api:** OpenAPI spec update via Stainless API ([#232](https://github.com/Finch-API/finch-api-kotlin/issues/232)) ([47ba4be](https://github.com/Finch-API/finch-api-kotlin/commit/47ba4be971218e8528a5a463c47fbb2c509bcbfc))
* **client:** added structured fields to errors ([#231](https://github.com/Finch-API/finch-api-kotlin/issues/231)) ([4bc25cd](https://github.com/Finch-API/finch-api-kotlin/commit/4bc25cd96f71ec21db0a5698db1ea4515baa3ec6))


### Documentation

* adjust additional properties example ([#229](https://github.com/Finch-API/finch-api-kotlin/issues/229)) ([aea4600](https://github.com/Finch-API/finch-api-kotlin/commit/aea4600cacb6161bbd4e4c73229f67c226342c39))

## 1.4.0 (2024-09-03)

Full Changelog: [v1.3.0...v1.4.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.3.0...v1.4.0)

### Features

* **api:** OpenAPI spec update via Stainless API ([#226](https://github.com/Finch-API/finch-api-kotlin/issues/226)) ([113b0f3](https://github.com/Finch-API/finch-api-kotlin/commit/113b0f3a632b88c896b1dc351569c6e8563cfa1f))

## 1.3.0 (2024-08-30)

Full Changelog: [v1.2.1...v1.3.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.2.1...v1.3.0)

### Features

* **api:** OpenAPI spec update via Stainless API ([#223](https://github.com/Finch-API/finch-api-kotlin/issues/223)) ([dd32700](https://github.com/Finch-API/finch-api-kotlin/commit/dd32700521f6ae121b469cf1aff7935b5f070bc4))


### Chores

* consistent string literal escaping ([#221](https://github.com/Finch-API/finch-api-kotlin/issues/221)) ([fad5753](https://github.com/Finch-API/finch-api-kotlin/commit/fad5753829f85c2fa7a204ca3d44523676fdaecc))
* **internal:** codegen related update ([#224](https://github.com/Finch-API/finch-api-kotlin/issues/224)) ([25ad562](https://github.com/Finch-API/finch-api-kotlin/commit/25ad562ae94ba92f011b735d738e3cdf339bd3f1))

## 1.2.1 (2024-08-28)

Full Changelog: [v1.2.0...v1.2.1](https://github.com/Finch-API/finch-api-kotlin/compare/v1.2.0...v1.2.1)

### Chores

* **internal:** codegen related update ([#218](https://github.com/Finch-API/finch-api-kotlin/issues/218)) ([21b0627](https://github.com/Finch-API/finch-api-kotlin/commit/21b062766f2ce27575126066459cd25316263b26))

## 1.2.0 (2024-08-28)

Full Changelog: [v1.1.0...v1.2.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.1.0...v1.2.0)

### Features

* chore: update reviewers for new teams ([#215](https://github.com/Finch-API/finch-api-kotlin/issues/215)) ([8a43d76](https://github.com/Finch-API/finch-api-kotlin/commit/8a43d76aae6e5cccb597872947ab135d04c8dfd6))

## 1.1.0 (2024-08-13)

Full Changelog: [v1.0.1...v1.1.0](https://github.com/Finch-API/finch-api-kotlin/compare/v1.0.1...v1.1.0)

### Features

* **api:** update via SDK Studio ([#212](https://github.com/Finch-API/finch-api-kotlin/issues/212)) ([b579fc0](https://github.com/Finch-API/finch-api-kotlin/commit/b579fc0371d1a953144cca9ea0c468d8c6b71062))

## 1.0.1 (2024-08-09)

Full Changelog: [v1.0.0...v1.0.1](https://github.com/Finch-API/finch-api-kotlin/compare/v1.0.0...v1.0.1)

### Chores

* **ci:** bump prism mock server version ([#210](https://github.com/Finch-API/finch-api-kotlin/issues/210)) ([b5b4cfd](https://github.com/Finch-API/finch-api-kotlin/commit/b5b4cfd94076dd64b9ce5e8ad12de727ef663cee))

## 1.0.0 (2024-08-01)

Full Changelog: [v0.29.0...v1.0.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.29.0...v1.0.0)

### Chores

* 1.0.0 stable release ([#207](https://github.com/Finch-API/finch-api-kotlin/issues/207)) ([da02d80](https://github.com/Finch-API/finch-api-kotlin/commit/da02d80a60836ea3ed5b3f816ac2343bafa0bca5))
* stainless release ([#209](https://github.com/Finch-API/finch-api-kotlin/issues/209)) ([d9b82cc](https://github.com/Finch-API/finch-api-kotlin/commit/d9b82cc3ce7b8313585566c7e932f1857ab0429a))

## 0.29.0 (2024-07-30)

Full Changelog: [v0.28.0...v0.29.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.28.0...v0.29.0)

### Features

* **client:** deprecate getAccessToken in favor of client.accessTokens().create() ([#204](https://github.com/Finch-API/finch-api-kotlin/issues/204)) ([183fc5b](https://github.com/Finch-API/finch-api-kotlin/commit/183fc5bad556156c51db97c6076534cd19e5f3ea))


### Chores

* **ci:** run tests in CI ([#206](https://github.com/Finch-API/finch-api-kotlin/issues/206)) ([95788d5](https://github.com/Finch-API/finch-api-kotlin/commit/95788d5df4ec911a0ed3064815555ef01ed1ae9e))

## 0.28.0 (2024-07-30)

Full Changelog: [v0.27.1...v0.28.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.27.1...v0.28.0)

### Features

* **client:** improve binary return values ([#202](https://github.com/Finch-API/finch-api-kotlin/issues/202)) ([4a86cc7](https://github.com/Finch-API/finch-api-kotlin/commit/4a86cc72b088d63c78233aad308438e978a95801))


### Bug Fixes

* **client:** add missing API fields to GetAccessTokenResponse ([22406ee](https://github.com/Finch-API/finch-api-kotlin/commit/22406ee6231a7407bafc0672e42c6cd23450505b))

## 0.27.1 (2024-07-29)

Full Changelog: [v0.27.0...v0.27.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.27.0...v0.27.1)

### Bug Fixes

* **client:** GetAccessTokenResponse was incorrectly expecting property 'accessToken' instead of 'access_token' ([#198](https://github.com/Finch-API/finch-api-kotlin/issues/198)) ([10b76af](https://github.com/Finch-API/finch-api-kotlin/commit/10b76afa28f299eda9620643981bbbabd20693ee))

## 0.27.0 (2024-07-26)

Full Changelog: [v0.26.1...v0.27.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.26.1...v0.27.0)

### Features

* **api:** add 'payment frequencies' and 'pay group ids' to payment model ([#196](https://github.com/Finch-API/finch-api-kotlin/issues/196)) ([5513919](https://github.com/Finch-API/finch-api-kotlin/commit/551391973d782bf6f6b94020ee75072a1de04cc6))

## 0.26.1 (2024-07-24)

Full Changelog: [v0.26.0...v0.26.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.26.0...v0.26.1)

### Bug Fixes

* **api:** mark redirect_uri as optional for getAccessToken helper ([#195](https://github.com/Finch-API/finch-api-kotlin/issues/195)) ([44e9f69](https://github.com/Finch-API/finch-api-kotlin/commit/44e9f69dbecd7d60791ce066e1a0fbdb5aeb8be6))


### Chores

* **tests:** update prism version ([#193](https://github.com/Finch-API/finch-api-kotlin/issues/193)) ([303ff54](https://github.com/Finch-API/finch-api-kotlin/commit/303ff54424dd71b437f7a65fbf840c1ead26b372))

## 0.26.0 (2024-07-19)

Full Changelog: [v0.25.4...v0.26.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.25.4...v0.26.0)

### ⚠ BREAKING CHANGES

* **api:** authentication method type is an enum, not a plain string ([#190](https://github.com/Finch-API/finch-api-kotlin/issues/190))

### Bug Fixes

* **api:** authentication method type is an enum, not a plain string ([#190](https://github.com/Finch-API/finch-api-kotlin/issues/190)) ([cef8537](https://github.com/Finch-API/finch-api-kotlin/commit/cef8537eb21e9b83d8448d07c37411b0d85fd869))


### Chores

* **ci:** limit release doctor target branches ([#191](https://github.com/Finch-API/finch-api-kotlin/issues/191)) ([ec23e75](https://github.com/Finch-API/finch-api-kotlin/commit/ec23e75552c195d7ee37e19bd29faa6d2f855b7d))
* **docs:** improve docstrings ([#192](https://github.com/Finch-API/finch-api-kotlin/issues/192)) ([6ad3c92](https://github.com/Finch-API/finch-api-kotlin/commit/6ad3c923c8541ea3a7442fc11ecd6623b736f057))
* **internal:** codegen related update ([#187](https://github.com/Finch-API/finch-api-kotlin/issues/187)) ([4ab7fb0](https://github.com/Finch-API/finch-api-kotlin/commit/4ab7fb05828f605e80c7579bc1bc75047e491f8c))

## 0.25.4 (2024-07-16)

Full Changelog: [v0.25.3...v0.25.4](https://github.com/Finch-API/finch-api-kotlin/compare/v0.25.3...v0.25.4)

### Bug Fixes

* **api:** remove unused fields ([#182](https://github.com/Finch-API/finch-api-kotlin/issues/182)) ([1ee675e](https://github.com/Finch-API/finch-api-kotlin/commit/1ee675ed6396142697a87b7b8437db6bd43da96c))
* undo accidental deletion ([#186](https://github.com/Finch-API/finch-api-kotlin/issues/186)) ([f290048](https://github.com/Finch-API/finch-api-kotlin/commit/f290048902a84bc3d46c63951bd6dd615966509d))


### Chores

* **docs:** minor update to formatting of API link in README ([#185](https://github.com/Finch-API/finch-api-kotlin/issues/185)) ([eba7cd2](https://github.com/Finch-API/finch-api-kotlin/commit/eba7cd2d84c6c8ce5fd09d93f889882c1e1c67dc))

## 0.25.3 (2024-07-11)

Full Changelog: [v0.25.2...v0.25.3](https://github.com/Finch-API/finch-api-kotlin/compare/v0.25.2...v0.25.3)

### Chores

* **ci:** also run workflows for PRs targeting `next` ([#180](https://github.com/Finch-API/finch-api-kotlin/issues/180)) ([fd15b84](https://github.com/Finch-API/finch-api-kotlin/commit/fd15b841120bc0a5f0ee5e6a769608ee14fad291))
* **docs:** document minimum Java version (Java 8) in README ([#178](https://github.com/Finch-API/finch-api-kotlin/issues/178)) ([448f290](https://github.com/Finch-API/finch-api-kotlin/commit/448f290a868165bc1680241997c3d984144050e9))


### Documentation

* **examples:** update example values ([#181](https://github.com/Finch-API/finch-api-kotlin/issues/181)) ([52745f5](https://github.com/Finch-API/finch-api-kotlin/commit/52745f5a04e512b41fcc3b633df96d4c915418c1))

## 0.25.2 (2024-07-01)

Full Changelog: [v0.25.1...v0.25.2](https://github.com/Finch-API/finch-api-kotlin/compare/v0.25.1...v0.25.2)

### Chores

* sync openapi spec ([#175](https://github.com/Finch-API/finch-api-kotlin/issues/175)) ([3def5ca](https://github.com/Finch-API/finch-api-kotlin/commit/3def5cac1009082d4f480bc202db3aff02ecc6ec))

## 0.25.1 (2024-06-28)

Full Changelog: [v0.25.0...v0.25.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.25.0...v0.25.1)

### Chores

* gitignore test server logs ([#173](https://github.com/Finch-API/finch-api-kotlin/issues/173)) ([bcd7c44](https://github.com/Finch-API/finch-api-kotlin/commit/bcd7c44cbee1c681c267f24c7c6dbf87eec00a11))

## 0.25.0 (2024-06-17)

Full Changelog: [v0.24.1...v0.25.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.24.1...v0.25.0)

### Features

* **client:** add support for `putQueryParam` on `ClientOptions` ([#171](https://github.com/Finch-API/finch-api-kotlin/issues/171)) ([01625b2](https://github.com/Finch-API/finch-api-kotlin/commit/01625b28fedbdf3e0161f82c57db879d5235486d))

## 0.24.1 (2024-06-07)

Full Changelog: [v0.24.0...v0.24.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.24.0...v0.24.1)

### Bug Fixes

* rename pay groups endpoint ([#168](https://github.com/Finch-API/finch-api-kotlin/issues/168)) ([2d427a5](https://github.com/Finch-API/finch-api-kotlin/commit/2d427a598486c1858e8f040ae59c68d214858618))

## 0.24.0 (2024-06-06)

Full Changelog: [v0.23.1...v0.24.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.23.1...v0.24.0)

### Features

* **api:** updates ([#165](https://github.com/Finch-API/finch-api-kotlin/issues/165)) ([317ffba](https://github.com/Finch-API/finch-api-kotlin/commit/317ffba95e2b0d77b999408bbb756ff6d4938f6d))

## 0.23.1 (2024-05-29)

Full Changelog: [v0.23.0...v0.23.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.23.0...v0.23.1)

### Chores

* **internal:** add dev scripts ([#162](https://github.com/Finch-API/finch-api-kotlin/issues/162)) ([b689c73](https://github.com/Finch-API/finch-api-kotlin/commit/b689c7327748feac7b3eb961fdba525631f549b0))


### Documentation

* **examples:** fix example snippets ([cc67da4](https://github.com/Finch-API/finch-api-kotlin/commit/cc67da44f87ae5df02c8adc37a078012dcb8b122))

## 0.23.0 (2024-05-14)

Full Changelog: [v0.22.7...v0.23.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.22.7...v0.23.0)

### Features

* propagate resource description field from stainless config to SDK docs ([#150](https://github.com/Finch-API/finch-api-kotlin/issues/150)) ([037749f](https://github.com/Finch-API/finch-api-kotlin/commit/037749fe0d97f5ae505788ad82a5c02796be7c4e))


### Bug Fixes

* **api:** correct authentication methods type ([#155](https://github.com/Finch-API/finch-api-kotlin/issues/155)) ([bd1f0d2](https://github.com/Finch-API/finch-api-kotlin/commit/bd1f0d289ac421fe3e7e501f88c1995914e1d16e))


### Chores

* **docs:** add SECURITY.md ([#152](https://github.com/Finch-API/finch-api-kotlin/issues/152)) ([701749c](https://github.com/Finch-API/finch-api-kotlin/commit/701749cca7ab7887492e8b2a54ebf6e34e21b471))
* **internal:** add scripts-to-rule-them-all ([#157](https://github.com/Finch-API/finch-api-kotlin/issues/157)) ([de0f222](https://github.com/Finch-API/finch-api-kotlin/commit/de0f22264e60c64d61c997405dac71aad654a499))
* **internal:** minor updates ([#154](https://github.com/Finch-API/finch-api-kotlin/issues/154)) ([be91a55](https://github.com/Finch-API/finch-api-kotlin/commit/be91a55dbf0d7ebe48b81f989561d549bf5ef860))
* **tests:** update client ID example value ([#156](https://github.com/Finch-API/finch-api-kotlin/issues/156)) ([7e21749](https://github.com/Finch-API/finch-api-kotlin/commit/7e2174934a600375ffc6b1a11e75ffe435ef1947))

## 0.22.7 (2024-05-01)

Full Changelog: [v0.22.6...v0.22.7](https://github.com/Finch-API/finch-api-kotlin/compare/v0.22.6...v0.22.7)

### Chores

* **internal:** add scripts/mock ([#146](https://github.com/Finch-API/finch-api-kotlin/issues/146)) ([13fa391](https://github.com/Finch-API/finch-api-kotlin/commit/13fa391da9a8be04938f28ac339e25af5d12227a))
* **internal:** bump mock server version to ~5.8.0 ([#148](https://github.com/Finch-API/finch-api-kotlin/issues/148)) ([a7fe62e](https://github.com/Finch-API/finch-api-kotlin/commit/a7fe62ef5020902de4456fe172ed66f7aa6aba9c))

## 0.22.6 (2024-04-30)

Full Changelog: [v0.22.5...v0.22.6](https://github.com/Finch-API/finch-api-kotlin/compare/v0.22.5...v0.22.6)

### Chores

* **internal:** add link to openapi spec ([#144](https://github.com/Finch-API/finch-api-kotlin/issues/144)) ([265fb01](https://github.com/Finch-API/finch-api-kotlin/commit/265fb01d2b900fb386b4fc70a4290b2962a65425))

## 0.22.5 (2024-04-29)

Full Changelog: [v0.22.4...v0.22.5](https://github.com/Finch-API/finch-api-kotlin/compare/v0.22.4...v0.22.5)

### Bug Fixes

* **internal:** escape characters for POM description in gradle publish ([#142](https://github.com/Finch-API/finch-api-kotlin/issues/142)) ([26224e0](https://github.com/Finch-API/finch-api-kotlin/commit/26224e0825288cdf9c1494f9f082b04ed2460208))

## 0.22.4 (2024-04-25)

Full Changelog: [v0.22.3...v0.22.4](https://github.com/Finch-API/finch-api-kotlin/compare/v0.22.3...v0.22.4)

### Documentation

* clarify behavior around employee_size ([#140](https://github.com/Finch-API/finch-api-kotlin/issues/140)) ([d28f696](https://github.com/Finch-API/finch-api-kotlin/commit/d28f6960de5efcdd51e923427bc4b91393c082e5))

## 0.22.3 (2024-04-24)

Full Changelog: [v0.22.2...v0.22.3](https://github.com/Finch-API/finch-api-kotlin/compare/v0.22.2...v0.22.3)

### Chores

* **internal:** use actions/checkout@v4 for codeflow ([#138](https://github.com/Finch-API/finch-api-kotlin/issues/138)) ([1e3d0bc](https://github.com/Finch-API/finch-api-kotlin/commit/1e3d0bcfd1c3419c68c80be143f34c710485759d))

## 0.22.2 (2024-04-23)

Full Changelog: [v0.22.1...v0.22.2](https://github.com/Finch-API/finch-api-kotlin/compare/v0.22.1...v0.22.2)

### Chores

* **internal:** gradlew v8.7, use gradle task config avoidance APIs ([#136](https://github.com/Finch-API/finch-api-kotlin/issues/136)) ([92bde04](https://github.com/Finch-API/finch-api-kotlin/commit/92bde0415807d12896b5bbb35080613e0b96d9bf))

## 0.22.1 (2024-04-21)

Full Changelog: [v0.22.0...v0.22.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.22.0...v0.22.1)

### Chores

* **ci:** validate Gradle wrapper ([#134](https://github.com/Finch-API/finch-api-kotlin/issues/134)) ([c379f73](https://github.com/Finch-API/finch-api-kotlin/commit/c379f736b0872d32652d32ca4a6ab8d484db5921))

## 0.22.0 (2024-04-16)

Full Changelog: [v0.21.0...v0.22.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.21.0...v0.22.0)

### Features

* **api:** updates ([#131](https://github.com/Finch-API/finch-api-kotlin/issues/131)) ([735a11f](https://github.com/Finch-API/finch-api-kotlin/commit/735a11f336ce51e1850b2593b2987ca922470534))
* **client:** implement support for multipart/form-data body requests ([#129](https://github.com/Finch-API/finch-api-kotlin/issues/129)) ([e5dc24a](https://github.com/Finch-API/finch-api-kotlin/commit/e5dc24aba10ae04ca05f04267c9ab11a49f1abf9))


### Chores

* **internal:** formatting ([#132](https://github.com/Finch-API/finch-api-kotlin/issues/132)) ([dc09782](https://github.com/Finch-API/finch-api-kotlin/commit/dc09782fbf809819c3f0145ddd18aca0d11f5554))


### Build System

* configure UTF-8 locale in devcontainer ([#133](https://github.com/Finch-API/finch-api-kotlin/issues/133)) ([4cb138a](https://github.com/Finch-API/finch-api-kotlin/commit/4cb138aeca971d87b614e9b13f6c62a3ff9b53aa))

## 0.21.0 (2024-04-09)

Full Changelog: [v0.20.1...v0.21.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.20.1...v0.21.0)

### Features

* **api:** updates ([#126](https://github.com/Finch-API/finch-api-kotlin/issues/126)) ([843a6de](https://github.com/Finch-API/finch-api-kotlin/commit/843a6debd6b853c2828a877087d9d14b505584b0))


### Chores

* **tests:** import wiremock.client.WireMock.put ([#128](https://github.com/Finch-API/finch-api-kotlin/issues/128)) ([d6c852b](https://github.com/Finch-API/finch-api-kotlin/commit/d6c852b2253930a57ecad6c29a3bc2877e2059e8))

## 0.20.1 (2024-04-04)

Full Changelog: [v0.20.0...v0.20.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.20.0...v0.20.1)

### Chores

* **api:** improve descriptions ([#124](https://github.com/Finch-API/finch-api-kotlin/issues/124)) ([425d262](https://github.com/Finch-API/finch-api-kotlin/commit/425d262121b2eba259e1d7a929250ef7f8ab68cf))

## 0.20.0 (2024-04-03)

Full Changelog: [v0.19.1...v0.20.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.19.1...v0.20.0)

### Features

* **client:** add support for top-level array body params ([#120](https://github.com/Finch-API/finch-api-kotlin/issues/120)) ([3efe064](https://github.com/Finch-API/finch-api-kotlin/commit/3efe064ca7e27b1f73fd40f08e2acd1c7d9ffa18))


### Chores

* **deps:** update jackson to v2.14.3 ([#118](https://github.com/Finch-API/finch-api-kotlin/issues/118)) ([d772b92](https://github.com/Finch-API/finch-api-kotlin/commit/d772b9241340d570bc61a6b9bb375e03206eaa1a))
* **deps:** update junit5 to v5.9.3 ([#122](https://github.com/Finch-API/finch-api-kotlin/issues/122)) ([95c1341](https://github.com/Finch-API/finch-api-kotlin/commit/95c13416b1f8af353fd3f22f94c480a736026b3e))
* **deps:** update kotlin-gradle-plugin to v1.9.23 ([#121](https://github.com/Finch-API/finch-api-kotlin/issues/121)) ([18f10af](https://github.com/Finch-API/finch-api-kotlin/commit/18f10af7afdb2f945da52d2d685dcd48d946bea4))
* **deps:** update kotlinx-coroutines-core to v1.8.0 ([#123](https://github.com/Finch-API/finch-api-kotlin/issues/123)) ([c6da004](https://github.com/Finch-API/finch-api-kotlin/commit/c6da004aef63f211f5d5606d2845ba77ad8288e1))

## 0.19.1 (2024-03-27)

Full Changelog: [v0.19.0...v0.19.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.19.0...v0.19.1)

### Bug Fixes

* handle nullable values inside of arrays ([#116](https://github.com/Finch-API/finch-api-kotlin/issues/116)) ([344e654](https://github.com/Finch-API/finch-api-kotlin/commit/344e6541a646e18e295a4ac84f0515c71524ebf1))


### Chores

* revert temporary commit ([1b18b7a](https://github.com/Finch-API/finch-api-kotlin/commit/1b18b7a1d5b81048fbe10afe8af6ba8ca2ca6dcb))
* temporary commit ([#117](https://github.com/Finch-API/finch-api-kotlin/issues/117)) ([af1d6fc](https://github.com/Finch-API/finch-api-kotlin/commit/af1d6fce782f7de5394bff7989cafec9f56a57ae))


### Documentation

* **readme:** consistent use of sentence case in headings ([#114](https://github.com/Finch-API/finch-api-kotlin/issues/114)) ([2328d09](https://github.com/Finch-API/finch-api-kotlin/commit/2328d093b51f628dafb5cd7dc61b538e30e56071))

## 0.19.0 (2024-03-13)

Full Changelog: [v0.18.3...v0.19.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.18.3...v0.19.0)

### Features

* add HttpRequestBody.contentLength() ([#112](https://github.com/Finch-API/finch-api-kotlin/issues/112)) ([1a20e88](https://github.com/Finch-API/finch-api-kotlin/commit/1a20e88f22a3b82f79896d800f47519a747978fb))

## 0.18.3 (2024-03-05)

Full Changelog: [v0.18.2...v0.18.3](https://github.com/Finch-API/finch-api-kotlin/compare/v0.18.2...v0.18.3)

### Chores

* add api.md ([#111](https://github.com/Finch-API/finch-api-kotlin/issues/111)) ([0806ef4](https://github.com/Finch-API/finch-api-kotlin/commit/0806ef4b506527a529439fd55fe1397b6e5d431e))
* remove internal-only field ([#109](https://github.com/Finch-API/finch-api-kotlin/issues/109)) ([303cb06](https://github.com/Finch-API/finch-api-kotlin/commit/303cb0601d3b175e6d3daa7c09d70c368da292e8))

## 0.18.2 (2024-03-04)

Full Changelog: [v0.18.1...v0.18.2](https://github.com/Finch-API/finch-api-kotlin/compare/v0.18.1...v0.18.2)

### Documentation

* update some doc strings ([#107](https://github.com/Finch-API/finch-api-kotlin/issues/107)) ([0d96d17](https://github.com/Finch-API/finch-api-kotlin/commit/0d96d17cfc9133cbfa7e3c342c5d42cb8828d529))

## 0.18.1 (2024-03-04)

Full Changelog: [v0.18.0...v0.18.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.18.0...v0.18.1)

### Chores

* update some doc strings ([#105](https://github.com/Finch-API/finch-api-kotlin/issues/105)) ([bd15f83](https://github.com/Finch-API/finch-api-kotlin/commit/bd15f8369a69858b48860576720dbd13b9c43e88))

## 0.18.0 (2024-02-28)

Full Changelog: [v0.17.1...v0.18.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.17.1...v0.18.0)

### Features

* **api:** make redirect_uri optional ([#103](https://github.com/Finch-API/finch-api-kotlin/issues/103)) ([71a974b](https://github.com/Finch-API/finch-api-kotlin/commit/71a974b80115407af60ea27ba3af518fe23fd718))
* **api:** remove deprecated `deduction` from docstring ([#104](https://github.com/Finch-API/finch-api-kotlin/issues/104)) ([3e52454](https://github.com/Finch-API/finch-api-kotlin/commit/3e5245423849ccb203a23728cfd6d376c3fba174))


### Chores

* **ci:** update actions/setup-java action to v4 ([#97](https://github.com/Finch-API/finch-api-kotlin/issues/97)) ([c678f4d](https://github.com/Finch-API/finch-api-kotlin/commit/c678f4d7365dbe24dc706cad6052ebead3ad8c97))
* **internal:** update deps ([#95](https://github.com/Finch-API/finch-api-kotlin/issues/95)) ([7dd20bf](https://github.com/Finch-API/finch-api-kotlin/commit/7dd20bfa5606408dd251ee541dec832fa1c316db))
* update dependency com.diffplug.spotless:spotless-plugin-gradle to v6.25.0 ([#99](https://github.com/Finch-API/finch-api-kotlin/issues/99)) ([9782649](https://github.com/Finch-API/finch-api-kotlin/commit/9782649b34757cade5a6a67f39056cc4d57031fe))
* update dependency com.github.tomakehurst:wiremock-jre8 to v2.35.2 ([#102](https://github.com/Finch-API/finch-api-kotlin/issues/102)) ([0420f22](https://github.com/Finch-API/finch-api-kotlin/commit/0420f223cdd89464d611d8ea2ccb6d24ae40edc9))
* update dependency com.google.guava:guava to v33 ([#100](https://github.com/Finch-API/finch-api-kotlin/issues/100)) ([2fccb42](https://github.com/Finch-API/finch-api-kotlin/commit/2fccb4283d85a4e17e8e261d81b9e2f3fded1246))
* update dependency com.squareup.okhttp3:okhttp to v4.12.0 ([#98](https://github.com/Finch-API/finch-api-kotlin/issues/98)) ([a8ba672](https://github.com/Finch-API/finch-api-kotlin/commit/a8ba672817d8d084f9eb99b795ab63ee4e864bce))
* update dependency org.apache.httpcomponents.client5:httpclient5 to v5.3.1 ([#96](https://github.com/Finch-API/finch-api-kotlin/issues/96)) ([160547c](https://github.com/Finch-API/finch-api-kotlin/commit/160547cae88f3f7aca67485a983255f46f720fbb))
* update dependency org.assertj:assertj-core to v3.25.3 ([#93](https://github.com/Finch-API/finch-api-kotlin/issues/93)) ([58405ff](https://github.com/Finch-API/finch-api-kotlin/commit/58405ff4ebabf5431f2c63587c8d25c0e79ddd1b))
* update dependency org.assertj:assertj-guava to v3.25.3 ([#94](https://github.com/Finch-API/finch-api-kotlin/issues/94)) ([977b2d2](https://github.com/Finch-API/finch-api-kotlin/commit/977b2d281f45c13685f6d2a38c3e3dad70a2c43b))
* update dependency org.slf4j:slf4j-simple to v1.7.36 ([#91](https://github.com/Finch-API/finch-api-kotlin/issues/91)) ([be1c65a](https://github.com/Finch-API/finch-api-kotlin/commit/be1c65a952fb21a341156d2e96914bf2383703d3))
* update dependency org.slf4j:slf4j-simple to v2 ([#101](https://github.com/Finch-API/finch-api-kotlin/issues/101)) ([c831fb3](https://github.com/Finch-API/finch-api-kotlin/commit/c831fb39e119e36c087ab240b350e121fa3d7a84))

## 0.17.1 (2024-02-22)

Full Changelog: [v0.17.0...v0.17.1](https://github.com/Finch-API/finch-api-kotlin/compare/v0.17.0...v0.17.1)

### Chores

* update dependency org.apache.httpcomponents.core5:httpcore5 to v5.2.4 ([#89](https://github.com/Finch-API/finch-api-kotlin/issues/89)) ([56316e4](https://github.com/Finch-API/finch-api-kotlin/commit/56316e406b5fbea88a4cfb3a423c2a4f4073202e))

## 0.17.0 (2024-02-20)

Full Changelog: [v0.16.0...v0.17.0](https://github.com/Finch-API/finch-api-kotlin/compare/v0.16.0...v0.17.0)

### Features

* **api:** create new sandbox job ([#88](https://github.com/Finch-API/finch-api-kotlin/issues/88)) ([92080d1](https://github.com/Finch-API/finch-api-kotlin/commit/92080d17bf3c9e23bad30ad8c06706da2a13fced))


### Chores

* **internal:** refactor release environment script ([#85](https://github.com/Finch-API/finch-api-kotlin/issues/85)) ([faa2a00](https://github.com/Finch-API/finch-api-kotlin/commit/faa2a00960ba3070e4e658d9e7cf34351e34f6ef))

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
