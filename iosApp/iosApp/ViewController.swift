//
//  ViewController.swift
//  iosApp
//
//  Created by Julio Miguel Alorro on 06.09.19.
//  Copyright © 2019 Julio Alorro. All rights reserved.
//

import UIKit
import shared

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        let label: UILabel = UILabel()
        label.translatesAutoresizingMaskIntoConstraints = false
        self.view.addSubview(label)
        NSLayoutConstraint.activate([
            label.topAnchor.constraint(equalTo: self.view.topAnchor),
            label.bottomAnchor.constraint(equalTo: self.view.bottomAnchor),
            label.leftAnchor.constraint(equalTo: self.view.leftAnchor),
            label.rightAnchor.constraint(equalTo: self.view.rightAnchor)
        ])

        label.textAlignment = .center
        label.font = UIFont.systemFont(ofSize: 25.0)
        label.text = CommonKt.createApplicationScreenMessage()

    }


}

