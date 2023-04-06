Feature: Search and Place the order for products

Scenario: Search Experience for product search in both home and offers page

Given User is on Greenkart Landing Page
When User searched with short name "Tom" and extract actual name of product
Then User searched for same "Tom" in offers page to check if product exist
And validate product name in offers page matches with landing page